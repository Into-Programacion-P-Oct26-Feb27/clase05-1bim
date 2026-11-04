# clase05-1bim
# Clase 05 — Introducción a la Programación

## Manejo de cadenas en Java: `String.format()`

### 1. Introducción

En programación, frecuentemente necesitamos combinar información de diferentes tipos de datos para construir mensajes, presentar resultados o generar reportes.

Por ejemplo, un programa puede almacenar el nombre de una persona, su edad y su promedio académico en distintas variables. Sin embargo, al presentar esta información, necesitamos organizarla en un mensaje comprensible.

Java permite construir cadenas de varias maneras. Una de ellas es mediante el método `String.format()`.

Este método facilita la creación de textos estructurados, especialmente cuando necesitamos incorporar variables de diferentes tipos.

### 2. Concatenación de cadenas

Consideremos el siguiente ejemplo:

```java
String nombre = "Luis";
int edad = 20;
double promedio = 9.256;
```

Para presentar esta información, podemos utilizar el operador `+`:

```java
System.out.println("Estudiante: " + nombre
        + ", Edad: " + edad
        + ", Promedio: " + promedio);
```

Resultado:

```text
Estudiante: Luis, Edad: 20, Promedio: 9.256
```

Este código funciona correctamente.

Sin embargo, cuando necesitamos construir mensajes más extensos, incorporar numerosas variables o controlar la presentación de valores numéricos, la concatenación puede dificultar la lectura del código.

### 3. ¿Qué es `String.format()`?

`String.format()` es un método de Java que permite construir una cadena de texto utilizando una plantilla y un conjunto de valores.

Su estructura general es:

```java
String.format("Texto con especificadores", variable1, variable2);
```

Los especificadores indican dónde se colocarán los valores y cómo deben representarse.

Por ejemplo:

```java
String nombre = "Luis";
int edad = 20;

String mensaje = String.format(
        "El estudiante %s tiene %d años",
        nombre, edad
);

System.out.println(mensaje);
```

Resultado:

```text
El estudiante Luis tiene 20 años
```

En este ejemplo:

- `%s` representa una cadena de caracteres.
- `%d` representa un número entero.
- `nombre` proporciona el valor correspondiente a `%s`.
- `edad` proporciona el valor correspondiente a `%d`.

**Importante:** Los valores se incorporan siguiendo el orden de los especificadores.

### 4. Principales especificadores de formato

| Especificador | Descripción | Ejemplo |
|---|---|---|
| `%s` | Cadena de caracteres | `"Luis"` |
| `%d` | Número entero | `25` |
| `%f` | Número decimal | `12.500000` |
| `%.2f` | Número decimal con dos posiciones | `12.50` |
| `%.1f` | Número decimal con una posición | `12.5` |
| `%c` | Carácter | `'A'` |
| `%b` | Valor booleano | `true` |
| `%n` | Salto de línea | |
| `%%` | Símbolo de porcentaje | `%` |

Por ejemplo:

```java
String producto = "Computadora";
int cantidad = 3;
double precio = 850.758;

String mensaje = String.format(
        "Producto: %s, Cantidad: %d, Precio: $%.2f",
        producto, cantidad, precio
);

System.out.println(mensaje);
```

Resultado:

```text
Producto: Computadora, Cantidad: 3, Precio: $850.76
```

Observemos que `%.2f` permite presentar el precio con dos decimales.

El valor almacenado en la variable no cambia; únicamente se modifica su representación en la cadena.

**Nota:** La representación de los decimales depende de la configuración regional. Los ejemplos suponen una configuración que utiliza el punto decimal.

### 5. ¿Por qué utilizar `String.format()`?

Comparemos dos maneras de construir un mensaje.

**Mediante concatenación:**

```java
String nombre = "María";
int edad = 19;
double nota = 8.756;

System.out.println("Estudiante: " + nombre
        + " - Edad: " + edad
        + " - Nota: " + nota);
```

**Mediante `String.format()`:**

```java
String mensaje = String.format(
        "Estudiante: %s - Edad: %d - Nota: %.2f",
        nombre, edad, nota
);

System.out.println(mensaje);
```

Ambas alternativas son válidas, pero la segunda permite identificar con mayor facilidad la estructura del mensaje y controlar la presentación de los números.

Además, `String.format()` devuelve un objeto de tipo `String`, que podemos almacenar, reutilizar o transmitir a otros componentes del programa.

### 6. Diferencia entre `String.format()` y `System.out.printf()`

Los dos mecanismos utilizan especificadores de formato, pero tienen propósitos diferentes.

**`String.format()` construye una cadena:**

```java
String nombre = "Pedro";
double sueldo = 1250.5;

String reporte = String.format(
        "Empleado: %s - Sueldo: $%.2f",
        nombre, sueldo
);

System.out.println(reporte);
```

**`System.out.printf()` presenta directamente el texto:**

```java
System.out.printf(
        "Empleado: %s - Sueldo: $%.2f%n",
        nombre, sueldo
);
```

La principal diferencia es que `String.format()` devuelve una cadena que puede almacenarse en una variable, mientras que `System.out.printf()` escribe directamente en la salida estándar.

### 7. Ejemplos de la clase

En el proyecto `Ejemplo2` se encuentran los siguientes archivos para estudiar durante la clase.

**Ejemplo 3**

[Consultar Ejemplo3.java](https://github.com/Into-Programacion-P-Oct26-Feb27/clase05-1bim/blob/main/ejemplos/Ejemplo2/src/ejemplo2/Ejemplo3.java)

**Ejemplo 4**

[Consultar Ejemplo4.java](https://github.com/Into-Programacion-P-Oct26-Feb27/clase05-1bim/blob/main/ejemplos/Ejemplo2/src/ejemplo2/Ejemplo4.java)

Durante la revisión de estos archivos, es importante observar cómo se construyen los mensajes que presentan información al usuario.

Presten especial atención al uso de variables, tipos de datos, especificadores de formato y presentación de resultados.

### 8. Consideraciones importantes

**El orden de las variables importa.**

```java
String nombre = "Ana";
int edad = 21;

String mensaje = String.format(
        "Nombre: %s - Edad: %d",
        nombre, edad
);
```

**El especificador debe ser compatible con el tipo de dato.**

Por ejemplo, `%d` se utiliza para valores enteros y `%f` para valores numéricos de punto flotante.

Un especificador incompatible puede provocar una excepción durante la ejecución.

**Dar formato no significa modificar el valor original.**

```java
double valor = 15.789;

String resultado = String.format("%.2f", valor);
```

El contenido de `resultado` representa `15.79`, pero la variable `valor` sigue almacenando `15.789`.

**El operador `+` no está prohibido.**

La concatenación sigue siendo válida y puede resultar conveniente para mensajes sencillos. No obstante, cuando necesitamos construir reportes o controlar el formato de los valores, `String.format()` ofrece ventajas de legibilidad y organización.

### 9. Reflexión

La programación no consiste únicamente en conseguir que un programa produzca resultados correctos.

También implica escribir código que pueda comprenderse, mantenerse y modificarse con facilidad.

Dos programas pueden producir exactamente el mismo resultado y, sin embargo, presentar diferencias importantes en la claridad de su código.

Aprender a utilizar mecanismos como `String.format()` contribuye a desarrollar buenas prácticas desde las primeras etapas de formación en programación.

### 10. Referencias

Documentación oficial de Java:

- [Clase String — Java SE](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html)
- [Formatter — Java SE](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Formatter.html)
