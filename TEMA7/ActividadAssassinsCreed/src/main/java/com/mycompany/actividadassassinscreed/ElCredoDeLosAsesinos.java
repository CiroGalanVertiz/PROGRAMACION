/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividadassassinscreed;

/**
 *
 * @author cococ
 */
public class ElCredoDeLosAsesinos {
    public static void main(String[] args) {
        Gremio gremio = new Gremio();

        // 1-2. Añadir asesinos
        gremio.insertarAsesino(new Asesino("Ezio Auditore", 32, Rango.MENTOR, "Hoja oculta doble"));
        gremio.insertarAsesino(new Asesino("Altaïr Ibn-La'Ahad", 25, Rango.MAESTRO, "Espada de los Asesinos"));
        gremio.insertarAsesino(new Asesino("Shao Jun", 29, Rango.APRENDIZ, "Hoja de zapato"));

        gremio.mostrarAsesinos();

        // 3-4. Añadir duplicado Shao Jun
        System.out.println("Se vuelve a añadir a la asesina Shao Jun");
        gremio.insertarAsesino(new Asesino("Shao Jun", 29, Rango.APRENDIZ, "Hoja de zapato"));
        gremio.mostrarAsesinos();

        // 5. Eliminar Shao Jun
        System.out.println("Se hace UNA eliminacion de Shao Jun");
        gremio.eliminarAsesino("Shao Jun");
        gremio.mostrarAsesinos();

        // 6. Crear Temple y añadir templarios
        Temple temple = new Temple();
        temple.insertar(new Templario("Rodrigo Borgia", "Orden del Temple", 9));
        temple.insertar(new Templario("Haytham Kenway", "Abstergo", 6));
        temple.insertar(new Templario("César Borgia", "Orden del Temple", 10));

        // 7. Mostrar ascendente (corrección)
        temple.mostrar(false);

        // 8-9. Añadir artefactos
        gremio.agregarAInventario(new Artefacto("Fruto del Edén", "Precursores", "Control mental y manipulación"));
        gremio.agregarAInventario(new Artefacto("Bastón de Hermes", "Precursores", "Otorga inmortalidad"));
        gremio.agregarAInventario(new Artefacto("Espada del Edén", "Precursores", "Poder destructivo y habilidades sobrenaturales"));
        gremio.agregarAInventario(new Artefacto("Cáliz del Edén", "Precursores", "Sanación y longevidad"));

        gremio.mostrarInventario();

        // 10. Añadir otra Espada del Edén
        System.out.println("Se vuelve a añadir una Espada del Edén");
        gremio.agregarAInventario(new Artefacto("Espada del Edén", "Precursores", "Poder destructivo y habilidades sobrenaturales"));
        gremio.mostrarInventario();

        // 11. Eliminar una Espada del Edén
        System.out.println("Se elimina una Espada del Edén");
        gremio.eliminarDeInventario("Espada del Edén");
        gremio.mostrarInventario();
    }
}
