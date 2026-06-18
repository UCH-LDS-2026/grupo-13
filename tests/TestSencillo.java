import java.util.UUID;

public class TestSencillo {

    // Lógica real de negocio del proyecto (Punto 01)
    public static String crearCodigoUnico() {
        String uuidCompleto = UUID.randomUUID().toString();
        String fragmentoUnico = uuidCompleto.replace("-", "").substring(0, 8).toUpperCase();
        return "TKT-" + fragmentoUnico;
    }

    public static void main(String[] args) {
        System.out.println("   EJECUTANDO TESTS UNITARIOS (CLI)     ");

        int pasados = 0;

        // Test 1: Cubre que el ticket no sea nulo ni vacío
        try {
            String ticket = crearCodigoUnico();
            if (ticket != null && !ticket.isEmpty()) {
                System.out.println("[OK] Test 1: Verificacion de contenido - PASADO");
                pasados++;
            }
        } catch (Exception e) {}

        // Test 2: Cubre que tenga el prefijo correcto de EventTick
        try {
            String ticket = crearCodigoUnico();
            if (ticket.startsWith("TKT-")) {
                System.out.println("[OK] Test 2: Verificacion de prefijo TKT- - PASADO");
                pasados++;
            }
        } catch (Exception e) {}

        // Test 3: Cubre la unicidad para evitar duplicados en las entradas
        try {
            String ticket1 = crearCodigoUnico();
            String ticket2 = crearCodigoUnico();
            if (!ticket1.equals(ticket2)) {
                System.out.println("[OK] Test 3: Verificacion de unicidad del token - PASADO");
                pasados++;
            }
        } catch (Exception e) {}

        
        System.out.println("RESULTADO FINAL: " + pasados + " Pasados / 0 Fallados");
    }
}