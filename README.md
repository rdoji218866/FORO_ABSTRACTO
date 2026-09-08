# Práctica: Clases Abstractas y Polimorfismo en Java

## Datos del Estudiante
* **Nombre:** Rafael Dominguez Jimenez
* **Matrícula:** S25018109
* **Fecha:** 08/08/2026

---

## Descripción del Proyecto
Este repositorio contiene la implementación práctica de conceptos clave de la Programación Orientada a Objetos (POO) en Java, tales como **abstracción**, **herencia**, **polimorfismo** y el uso de **clases y métodos abstractos**.

### Componentes de la Práctica
1. **Jerarquía de Animales:**
   * **Clase raíz abstracta (`Animal`):** Define los atributos comunes (`sonido`, `alimentos`, `hábitat`, `nombreCientifico`) y los métodos abstractos correspondientes para obligar a las subclases a implementar su comportamiento específico.
   * **Clases intermedias:** `Cánido` y `Felino`.
   * **Clases concretas:** `Perro`, `Lobo`, `León` y `Gato`, cada una implementando sus características biológicas y sonoras correspondientes.
   * **Prueba:** Generación y recorrido de un arreglo/lista polimórfica de tipo `Animal[]` para mostrar sus datos en consola.

2. **Jerarquía de Figuras Geométricas:**
   * Implementación de una clase abstracta base `FiguraGeometrica` con métodos para el cálculo de áreas y perímetros.
   * Clases derivadas: `Circulo`, `Rectangulo`, `Triangulo` y `Cuadrado`.
   * Iteración dinámica y cálculo polimórfico mediante colecciones (`List<FiguraGeometrica>`).

---

## Fragmento de Código (Demostración de Polimorfismo)

```java
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(){
        List<FiguraGeometrica> Figuras = new ArrayList<>();
        Figuras.add(new Circulo("Diego2", 4));
        Figuras.add(new Rectangulo("Isa2", 10, 5));
        Figuras.add(new Triangulo("Cesar2", 6, 7));
        Figuras.add(new Cuadrado("Karol2", 2));

        for(FiguraGeometrica figura : Figuras){
            System.out.printf("Area = %.2f\n", figura.calcularArea());
            System.out.printf("Perimetro = %.2f\n", figura.calcularPerimetro());
            System.out.printf("Nombre = " + figura.getNombre() + "\n\n");
        }

        Circulo c1 = new Circulo("Diego", 3.5);
        Rectangulo r1 = new Rectangulo("Isa", 12, 1.3);
        Triangulo t1 = new Triangulo("Cesar", 20, 13);

        System.out.println("=======FIGURAS GEOMETRICAS=======");
        System.out.printf("Area = %.2f\n", c1.calcularArea());
        System.out.printf("Perimetro = %.2f\n", c1.calcularPerimetro());
        System.out.printf("Nombre = " + c1.getNombre() + "\n\n");

        System.out.printf("Area = %.2f\n", r1.calcularArea());
        System.out.printf("Perimetro = %.2f\n", r1.calcularPerimetro());
        System.out.printf("Nombre = " + r1.getNombre() + "\n\n");

        System.out.printf("Area = %.2f\n", t1.calcularArea());
        System.out.printf("Perimetro = %.2f\n", t1.calcularPerimetro());
        System.out.printf("Nombre = " + t1.getNombre() + "\n");
    }
}

UTILIZACIÓN DE IA: Por mi parte la única utilización de IA fue la de JetBrains al momento de copiar los métodos abstractos de la clase Animal.
