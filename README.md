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

public class Main{
    public static void main(String[] args){
        List<Animal> Animales = new ArrayList<>();
        Animales.add(new Lobo());
        Animales.add(new Perro());
        Animales.add(new Gato());
        Animales.add(new Leon());

        for(Animal x : Animales){
            System.out.println("Nombre cientifico: "+ x.getNombreCientifico());
            System.out.println("Sonido: "+ x.getSonido());
            System.out.println("Alimentacion: "+ x.getAlimento());
            System.out.println("Habitat: "+ x.getHabitat());
            System.out.println();
        }

    }
}

UTILIZACIÓN DE IA: Por mi parte la única utilización de IA fue la de JetBrains al momento de copiar los métodos abstractos de la clase Animal.
