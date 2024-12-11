package lesson8.prob3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // a.
        ArrayList<Marketing> data = new ArrayList<Marketing>();

        // b.
        data.add(new Marketing("John Smith", "55 inch TV", 349.99));
        data.add(new Marketing("Kelvin Durant", "Smartphone", 1049.98));
        data.add(new Marketing("Stephen Curry", "Blanket", 22));
        data.add(new Marketing("Veronica Parker", "Dinner Set", 139.69));
        data.add(new Marketing("Anthony Stark", "Dell Laptop", 549.99));

        // c.
        data.remove(3);

        // d.
        System.out.println("Size(): "+data.size());

        // e.
        System.out.println("At index 2: "+data.get(2));

        // f.
        data.set(3, new Marketing("Denzel Washington","Sofa set", 1387.99));
        System.out.println("\nReplaced:\n"+data.toString());

        // h.
        data.sort((a,b)->Double.compare(a.getSalesamount(), b.getSalesamount()));
        System.out.println("\nSorted by Sales:\n"+data.toString());

        // i.
        ArrayList<Marketing> over1000 = new ArrayList<>();

        for (Marketing person: data){
            if(person.getSalesamount() > 1000){
                over1000.add(person);
            }
        }

        System.out.println("\nEmployees making over 1000:\n"+over1000);

        over1000.sort((a,b)->a.getEmployeename().compareTo(b.getEmployeename()));

        System.out.println("\nSorted employees making over 1000:\n"+over1000);
    }

}
