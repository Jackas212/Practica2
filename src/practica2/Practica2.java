/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2;
import controlador.tda.lista.ListaEnlazadaServices;
import java.util.ArrayList;
import java.util.List;
import practica.MemoryUtil;

/**
 *
 * @author John
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Primero: Dato de tipo String vacio");
        String dato = "";
        System.out.println(MemoryUtil.deepSizeOf(dato));
        System.out.println("Primero: Dato de tipo String lleno");
        dato = "hola";
        System.out.println(MemoryUtil.deepSizeOf(dato));
        System.out.println("*****************************************");
        segundoTipos();
        System.out.println("*****************************************");
        TerceroArreglos();
        System.out.println("*****************************************");
        cuartoListas();
    }

    private static void segundoTipos() {
        System.out.println("SegundoA: Dato de tipo byte vacio");
        byte var2A = 0;
        System.out.println(MemoryUtil.deepSizeOf(var2A));
        System.out.println("SegundoA: Dato de tipo byte lleno");
        var2A = 10;
        System.out.println(MemoryUtil.deepSizeOf(var2A));
        System.out.println("SegundoB: Dato de tipo short vacio");
        short var2B = 0;
        System.out.println(MemoryUtil.deepSizeOf(var2B));
        System.out.println("SegundoB: Dato de tipo short lleno");
        var2B = 20;
        System.out.println(MemoryUtil.deepSizeOf(var2B));
        System.out.println("SegundoC: Dato de tipo int vacio");
        int var2C = 0;
        System.out.println(MemoryUtil.deepSizeOf(var2C));
        System.out.println("SegundoC: Dato de tipo int lleno");
        var2C = 50;
        System.out.println(MemoryUtil.deepSizeOf(var2C));
        System.out.println("SegundoD: Dato de tipo long vacio");
        long var2D = 0;
        System.out.println(MemoryUtil.deepSizeOf(var2D));
        System.out.println("SegundoD: Dato de tipo long lleno");
        var2D = 24;
        System.out.println(MemoryUtil.deepSizeOf(var2D));
        System.out.println("SegundoE: Dato de tipo float vacio");
        float var2E = 0;
        System.out.println(MemoryUtil.deepSizeOf(var2E));
        System.out.println("SegundoE: Dato de tipo float lleno");
        var2E = 20;
        System.out.println(MemoryUtil.deepSizeOf(var2E));
        System.out.println("SegundoF: Dato de tipo double vacio");
        double var2F = 0.0;
        System.out.println(MemoryUtil.deepSizeOf(var2F));
        System.out.println("SegundoF: Dato de tipo double lleno");
        var2F = 16.4;
        System.out.println(MemoryUtil.deepSizeOf(var2F));
        System.out.println("SegundoG: Dato de tipo boolean vacio");
        boolean var2G = false;
        System.out.println(MemoryUtil.deepSizeOf(var2G));
        System.out.println("SegundoG: Dato de tipo boolean lleno");
        var2G = true;
        System.out.println(MemoryUtil.deepSizeOf(var2G));
        System.out.println("SegundoH: Dato de tipo char vacio");
        char var2H = ' ';
        System.out.println(MemoryUtil.deepSizeOf(var2H));
        System.out.println("SegundoH: Dato de tipo char lleno");
        var2H = 'a';
        System.out.println(MemoryUtil.deepSizeOf(var2H));
    }

    private static void TerceroArreglos() {
        String arregloA[];
        int arregloB[];
        double arregloC[];
        char arregloD[];
        boolean arregloE[];
        System.out.println("Tercero arreglo tipo String vacio:");
        arregloA = new String[5];
        System.out.println(MemoryUtil.deepSizeOf(arregloA));
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = "datos nuevos";
        }
        System.out.println("Tercero arreglo tipo String lleno:");
        System.out.println(MemoryUtil.deepSizeOf(arregloA));

        System.out.println("Tercero arreglo tipo int vacio:");
        arregloB = new int[5];
        System.out.println(MemoryUtil.deepSizeOf(arregloB));
        for (int i = 0; i < arregloB.length; i++) {
            arregloB[i] = 24;
        }
        System.out.println("Tercero arreglo tipo int lleno:");
        System.out.println(MemoryUtil.deepSizeOf(arregloB));

        System.out.println("Tercero arreglo tipo double vacio:");
        arregloC = new double[5];
        System.out.println(MemoryUtil.deepSizeOf(arregloC));
        for (int i = 0; i < arregloC.length; i++) {
            arregloC[i] = 16.73;
        }
        System.out.println("Tercero arreglo tipo double lleno:");
        System.out.println(MemoryUtil.deepSizeOf(arregloC));

        System.out.println("Tercero arreglo tipo char vacio:");
        arregloD = new char[5];
        System.out.println(MemoryUtil.deepSizeOf(arregloD));
        for (int i = 0; i < arregloD.length; i++) {
            arregloD[i] = 'z';
        }
        System.out.println("Tercero arreglo tipo char lleno:");
        System.out.println(MemoryUtil.deepSizeOf(arregloD));

        System.out.println("Tercero arreglo tipo boolean vacio:");
        arregloE = new boolean[5];
        System.out.println(MemoryUtil.deepSizeOf(arregloE));
        for (int i = 0; i < arregloE.length; i++) {
            arregloE[i] = true;
        }
        System.out.println("Tercero arreglo tipo boolean lleno:");
        System.out.println(MemoryUtil.deepSizeOf(arregloE));
    }

    private static void cuartoListas() {
        System.out.println("Listas Enlazadas vacia:");
        ListaEnlazadaServices<String> lista = new ListaEnlazadaServices<>();
        System.out.println(MemoryUtil.deepSizeOf(lista));
        for (int i = 0; i < 25; i++) {
            lista.insertarAlFinal("prueba");
        }
        System.out.println("Lista Enlazada llena:");
        System.out.println(MemoryUtil.deepSizeOf(lista));
        System.out.println("Listas util vacia");
        List<String> listaUtil = new ArrayList<String>();
        System.out.println(MemoryUtil.deepSizeOf(listaUtil));
        for (int i = 0; i < 25; i++) {
            listaUtil.add("prueba");
        }
        System.out.println("Lista Util llenada:");
        System.out.println(MemoryUtil.deepSizeOf(listaUtil));
    }
}
