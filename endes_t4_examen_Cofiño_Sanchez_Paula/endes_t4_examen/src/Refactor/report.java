package refactor;

/*
Extraer la impresión del título y conclusión en sus propios métodos.
 */
class Report {

    static printReport() {
        // imprimir título
        System.out.println("Título del Reporte",get.titulo);

        // contenido del reporte
        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
        // más contenido...

        // imprimir conclusión
        System.out.println("Conclusión del Reporte",get.conclusión);

    }
}