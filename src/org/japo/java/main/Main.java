/* 
 * Copyright 2019 Manu Portolés Zagalá.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    public static final Random RND = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Constantes
        final int DIAS_SEM = 7;
        final int MAX_LLUV = 500;
        final int MIN_LLUV = 0;

        //Constantes
        int lluvDia;
        int lluvMax = 0;
        int lluvMin = 0;

        int diaMax = 0;
        int diaMin = 0;
        String diaSem = "0";
        String diaSemMax = "0";
        String diaSemMin = "0";
        int diaAct;
        //Bucle
        for (diaAct = 0; diaAct < DIAS_SEM; diaAct++) {
            //DiaHoy
            switch (diaAct + 1) {
                case 1:
                    diaSem = "Lunes";
                    break;
                case 2:
                    diaSem = "Martes";
                    break;
                case 3:
                    diaSem = "Miercoles";
                    break;
                case 4:
                    diaSem = "Jueves";
                    break;
                case 5:
                    diaSem = "Viernes";
                    break;
                case 6:
                    diaSem = "Sabado";
                    break;
                case 7:
                    diaSem = "Domingo";
                    break;
            }

            //LluviaHoy
            lluvDia = RND.nextInt(MAX_LLUV - MIN_LLUV) - MIN_LLUV;

            System.out.printf("%10s %3d l/m2%n", diaSem, lluvDia);

            //Bucle MAX
            if (diaAct == 0) {
                diaMax = 0;
                lluvMax = lluvDia;
            } else if (lluvDia > lluvMax) {
                diaMax = diaAct;
                lluvMax = lluvDia;
            }

            //BucleMin
            if (diaAct == 0) {
                diaMin = 0;
                lluvMin = lluvDia;
            } else if (lluvDia < lluvMin) {
                diaMin = diaAct;
                lluvMin = lluvDia;
            }
        }
        switch (diaMax + 1) {
            case 1:
                diaSemMax = "Lunes";
                break;
            case 2:
                diaSemMax = "Martes";
                break;
            case 3:
                diaSemMax = "Miercoles";
                break;
            case 4:
                diaSemMax = "Jueves";
                break;
            case 5:
                diaSemMax = "Viernes";
                break;
            case 6:
                diaSemMax = "Sabado";
                break;
            case 7:
                diaSemMax = "Domingo";
                break;
        }
        switch (diaMin + 1) {
            case 1:
                diaSemMin = "Lunes";
                break;
            case 2:
                diaSemMin = "Martes";
                break;
            case 3:
                diaSemMin = "Miercoles";
                break;
            case 4:
                diaSemMin = "Jueves";
                break;
            case 5:
                diaSemMin = "Viernes";
                break;
            case 6:
                diaSemMin = "Sabado";
                break;
            case 7:
                diaSemMin = "Domingo";
                break;
        }

        System.out.printf("%s %10s con %3d l/m2%n", "El día con más lluvias fué el ..:",
                diaSemMax, lluvMax);

        System.out.printf("%s %10s con %3d l/m2%n", "El día con menos lluvias fué el :",
                diaSemMin, lluvMin);
    }
}
