package org.example;

import java.util.ArrayList;

enum OrderStatus{
    PENDING, SHIPPED, DELIVERED, CANCELLED
}
public class Task1 {
    public static void printStatus(Orderstatus status){
        switch(status){
            case PENDING:
                System.out.println("na cekanju");
                break;


            case SHIPPED:
                System.out.println("dostavljeno");
                break;
        }
    }

}

}
