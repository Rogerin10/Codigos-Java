using System.Reflection;
using System.Text.RegularExpressions;

class program
{                                                        // Se declaran dos listas para almacenar datos de clientes y vehículos
    static List<string> clientes = new List<string>();      //  Esta lista está diseñada para almacenar cadenas de texto 
    static List<string> vehiculos = new List<string>();

    static void Main(string[] args)
    {                                      // variables
        string usuario = "", password = "";             // variables De Inicio de sesion 
        string nombre, apellido, rut, correo; int telefono;                               // -->variables del Cliente.
        string marcaVehiculo, modelo, Vehiculo_Con_mayor_ventas, marca, Modelo; // -->variables Vehiculos.
        bool continuarEjecucion = true; // Variable booleana

        //-----------------------------------------------------------------------------------------------------------------------

        // <--- Inicio --->
        Console.WriteLine("Bienvenido al Sistema ");
        Console.WriteLine(" ---Servirep--- ");
        // Bucle Do-While. // El bucle do-while permite que el usuario vuelva a intentar el inicio de sesión. 
        do

        {
            Console.WriteLine("Inicie sesión:");     // Usuario
            usuario = Console.ReadLine();
            Console.WriteLine("Ingrese Contraseña:");     // Contraseña
            password = Console.ReadLine();

            if (usuario.Equals("Usuario") && password.Equals("clave"))
            {
                Console.WriteLine("Inicio de sesión");
                break;
            }
            else
            {
                Console.WriteLine("Usuario o contraseña incorrectos. Intente nuevamente.");
            }
        } while (true);

        // se verifica si el contenido de las variables usuario y password es igual al texto "Usuario" y "clave".
        // Equals se utiliza para realizar una comparación de igualdad entre cadenas,
        //  y en este contexto, se utiliza para verificar el inicio de sesión del usuario.

        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        while (continuarEjecucion)
        {
            Console.WriteLine("¿Qué desea realizar?");
            Console.WriteLine("1. Ingresar información");
            Console.WriteLine("2. Ver datos");
            Console.WriteLine("3. Salir");
            int opcionRealizar = Convert.ToInt32(Console.ReadLine());

            switch (opcionRealizar)
            {
                case 1:
                    IngresarInformacion();
                    break;
                case 2:
                    VerDatos();
                    break;
                case 3:
                    Console.WriteLine("Finalizando...");
                    continuarEjecucion = false;
                    break;
                default:
                    Console.WriteLine("Opción no válida.");
                    break;
            }
        }
    }
    // El método IngresarInformacion maneja la lógica para ingresar información. dentro de este metodo, el usuario puede elegir, ingresar informacion. /clien../vehiculos
    // La información ingresada se almacena en las listas clientes o vehiculos.
    static void IngresarInformacion()
    {
        bool continuarIngresando = true;

        do
        {
            Console.WriteLine("¿Qué información desea ingresar?");
            Console.WriteLine("1. Clientes");
            Console.WriteLine("2. Vehículos");
            Console.WriteLine("3. Salir");
            int opcion = Convert.ToInt32(Console.ReadLine());

            switch (opcion)
            {
                case 1:
                    IngresarClientes();
                    break;
                case 2:
                    IngresarVehiculos();
                    break;
                case 3:
                    Console.WriteLine("Volviendo al menú principal.");
                    continuarIngresando = false;
                    break;
                default:
                    Console.WriteLine("Opción no válida.");
                    break;
            }
        } while (continuarIngresando);
    }
    static void IngresarClientes()    // Funcion -- IngresarClientes -- permite al usuario ingresar información sobre clientes, 
    {
        bool continuarIngresando = true;

        while (continuarIngresando)
        {
            Console.WriteLine("Ingrese nombre del Cliente:");
            string nombre = Console.ReadLine();

            Console.WriteLine("Ingrese Apellido del Cliente:");
            string apellido = Console.ReadLine();

            Console.WriteLine("Correo:");
            string correo = Console.ReadLine();

            Console.WriteLine("Ingrese telefono:");
            int telefono = int.Parse(Console.ReadLine());

            Console.WriteLine("Ingrese Rut:");
            string rut = Console.ReadLine();

            string nuevoCliente = $"{nombre} {apellido}, {correo}, {telefono}, {rut}. ";   // Después de crear la cadena nuevoCliente, .    
            clientes.Add(nuevoCliente);                                                      // esta línea de código agrega esa cadena a la lista clientes utilizando el método .Add

            Console.WriteLine($"Información ingresada: {nombre} {apellido} {correo} {telefono}. ");

            Console.WriteLine("¿Desea ingresar otra información de cliente? (S/N):");
            string respuesta = Console.ReadLine();

            if (respuesta.ToLower() != "s")
                continuarIngresando = false;
        }
    }
    /*
       *  Se verifica si la respuesta del usuario (convertida a minuscula con " respuesta.ToLower()) "
       *  es diferente de "s". Si la respuesta no es "s", se establece " continuarIngresando " en false / falso, 
       *  lo que hace que el bucle while se detenga y el método termine. 
       *  si el usuario no desea continuar ingresando información de clientes, el programa sale del bucle y vuelve al menú principal.
       */

    static void IngresarVehiculos()      // Funcion  IngresarVehiculos --- permite al usuario ingresar información sobre vehículos.
    {
        bool continuarIngresando = true;

        while (continuarIngresando)
        {
            Console.WriteLine("Ingrese Marca del Vehiculo:");
            string marca = Console.ReadLine();

            Console.WriteLine("Ingrese Modelo del Vehiculo:");
            string modelo = Console.ReadLine();

            Console.WriteLine("Ingrese color del vehiculo ");
            string color = Console.ReadLine();

            Console.WriteLine("Ingrese patente del vehiculo ");
            string patente = Console.ReadLine();                                      /*  El método Add es una forma común de insertar elementos en una colección, como una lista. 
                                                                                       *  En cada llamada, agrega el elemento especificado al final de la colección.  
                                                                                       *  como en este caso donde se esta registrando información de clientes y vehículos en las listas correspondientes.
                                                                                       */
            string nuevoVehiculo = $"{marca}, {modelo} {patente} {color}. ";        //  Después de crear la cadena nuevoVehiculo, esta línea de código agrega esa cadena a la lista vehiculos utilizando el método "Add".
            vehiculos.Add(nuevoVehiculo);

            Console.WriteLine($"Datos ingresados: {marca}, {modelo}, {patente}, {color}. ");

            Console.WriteLine("¿Desea ingresar otro vehículo? (S/N):");
            string respuesta = Console.ReadLine();

            if (respuesta.ToLower() != "s")
                continuarIngresando = false;
        }
    }
    static void MostrarDatos(List<string> datos)  // Funcion MostrarDatos
    {
        if (datos.Count == 0)
        {
            Console.WriteLine("No hay datos para mostrar.");
        }
        else
        {
            Console.WriteLine("Datos:");
            for (int i = 0; i < datos.Count; i++)
            {
                Console.WriteLine($"{i + 1}. {datos[i]}");
            }
        }
    }

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    static void VerDatos()             // Funcio --> VerDatos
    {
        Console.WriteLine("¿Qué datos deseas ver?");
        Console.WriteLine("1. Datos de Clientes");
        Console.WriteLine("2. Datos de Vehículos");
        Console.WriteLine("3. Datos del Vehículo con mayor número de ventas");
        Console.WriteLine("4. Volver al menú principal");

        int opcion = Convert.ToInt32(Console.ReadLine());    // Se lee la variable opcion

        // Switch para manejar la selección del usuario y mostrar la información correspondiente en función de su elección.

        switch (opcion)
        {
            case 1:
                Console.WriteLine("Datos de Clientes:");
                MostrarDatos(clientes);
                break;
            case 2:
                Console.WriteLine("Datos de Vehículos:");
                MostrarDatos(vehiculos);
                break;
            case 3:
                Console.WriteLine("Toyota Yaris ");
                break;
            case 4:
                Console.WriteLine("Volviendo al menú principal.");
                break;
            default:
                Console.WriteLine("Opción no válida.");
                break;
        }
    }
}



