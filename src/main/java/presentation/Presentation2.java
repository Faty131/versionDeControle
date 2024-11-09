package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(new File("config.txt"));

        String doaClassNAme =scanner.nextLine();
        Class cDao=Class.forName(doaClassNAme);
        IDao dao =(IDao) cDao.newInstance();

        String metierClassNAme =scanner.nextLine();
        Class cMetier=Class.forName(metierClassNAme);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println("Résultat=>"+metier.calcul());
    }
}
