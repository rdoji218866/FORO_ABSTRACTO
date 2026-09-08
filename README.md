# Práctica: Jerarquía de Clases Animales (POO)

Implementación en Java sobre abstracción, herencia y polimorfismo mediante el modelado de una taxonomía animal compuesta por clases abstractas intermedias y clases concretas.

---

## 📌 Datos del Alumno

| Campo | Detalle |
| :--- | :--- |
| **Nombre** | Rafael Dominguez Jimenez |
| **Matrícula** | S25018109 |
| **Fecha** | 08/08/2026 |

---

## 📖 Descripción del Problema

El ejercicio modela una jerarquía basada en una clase raíz abstracta `Animal`, la cual define métodos para obtener datos específicos de cada especie (nombre científico, sonido, alimentación y hábitat). La estructura se organiza de la siguiente manera:

* **Animal (Clase abstracta raíz):** Declara los métodos `getNombreCientifico()`, `getSonido()`, `getAlimentos()` y `getHabitat()`.
* **Cánido y Felino (Subclases abstractas intermedias):** Heredan de `Animal` y agrupan comportamientos biológicos más específicos sin llegar a instanciarse directamente.
* **Clases Concretas:**
  * **Perro** (*Canis lupus familiaris*): Ladrido, carnívoro, doméstico.
  * **Lobo** (*Canis lupus*): Aullido, carnívoro, bosque.
  * **León** (*Panthera leo*): Rugido, carnívoro, pradera.
  * **Gato** (*Felis silvestris catus*): Maullido, ratones, doméstico.

---

## 💻 Implementación del Método Principal (`Main.java`)

Demostración del polimorfismo almacenando instancias de las subclases concretas en una colección genérica referenciada a la clase base:

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> Animales = new ArrayList<>();
        Animales.add(new Lobo());
        Animales.add(new Perro());
        Animales.add(new Gato());
        Animales.add(new Leon());

        for (Animal x : Animales) {
            System.out.println("Nombre cientifico: " + x.getNombreCientifico());
            System.out.println("Sonido: " + x.getSonido());
            System.out.println("Alimentacion: " + x.getAlimento());
            System.out.println("Habitat: " + x.getHabitat());
            System.out.println();
        }
    }
}

//Por mi parte la única utilización de IA fue la de JetBrains al momento de copiar los métodos abstractos de la clase Animal.
