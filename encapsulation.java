// Criando encapsulamento

public class encaps {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}

class prnt {
    public static void main(String[] args) {
        encaps myObj = new encaps();
        myObj.setName("Eduardo");  // Define o valor de name para Eduardo
        System.out.println(myObj.getName());
    }
}
