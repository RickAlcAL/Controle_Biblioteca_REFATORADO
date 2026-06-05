package Applications.Main;

import Applications.Menu.Menu;

public class ControleBiblioteca {
    static void main(String[] args) {
        Menu menu= new Menu();

        System.out.println("Bem vindo ao sistema de biblioteca!");
        menu.menuPrincipal();
    }
}
