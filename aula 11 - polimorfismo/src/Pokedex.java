public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee e = new Eevee();
        Jolteon j = new Jolteon();
        Espeon es = new Espeon();
        Floreon f = new Floreon();
        Glaceon g = new Glaceon();
        Leafeon l = new Leafeon();
        Sylveon s = new Sylveon();
        Umbreon u = new Umbreon();
        Vaporeon v = new Vaporeon();

        System.out.println("Eu sou Eevee");
        System.out.println("Ataque: "+e.ataque());
        System.out.println("Defesa: "+e.defesa());
        System.out.println("Especial: "+e.especial());
        System.out.println("___________________________________");
        
        e=j;
        System.out.println("Eu sou Jolteon");
        System.out.println("Ataque: "+e.ataque());
        System.out.println("Defesa: "+e.defesa());
        System.out.println("Especial: "+e.especial());
        System.out.println("___________________________________");

        e=es;
        System.out.println("Eu sou Espeon");
        System.out.println("Ataque: "+e.ataque());
        System.out.println("Defesa: "+e.defesa());
        System.out.println("Especial: "+e.especial());
        System.out.println("___________________________________");

        e=f;
        System.out.println("Eu sou Floreon");
        System.out.println("Ataque: "+e.ataque());
        System.out.println("Defesa: "+e.defesa());
        System.out.println("Especial: "+e.especial());
        System.out.println("___________________________________");

        e=g;
        System.out.println("Eu sou Glaceon");
        System.out.println("Ataque: "+e.ataque());
        System.out.println("Defesa: "+e.defesa());
        System.out.println("Especial: "+e.especial());
        System.out.println("___________________________________");

        e=l;
        System.out.println("Eu sou Leafeon");
        System.out.println("Ataque: "+e.ataque());
        System.out.println("Defesa: "+e.defesa());
        System.out.println("Especial: "+e.especial());
        System.out.println("___________________________________");

        e=s;
        System.out.println("Eu sou Sylveon");
        System.out.println("Ataque: "+e.ataque());
        System.out.println("Defesa: "+e.defesa());
        System.out.println("Especial: "+e.especial());
        System.out.println("___________________________________");

        e=u;
        System.out.println("Eu sou Umbreon");
        System.out.println("Ataque: "+e.ataque());
        System.out.println("Defesa: "+e.defesa());
        System.out.println("Especial: "+e.especial());
        System.out.println("___________________________________");

        e=v;
        System.out.println("Eu sou Vaporeon");
        System.out.println("Ataque: "+e.ataque());
        System.out.println("Defesa: "+e.defesa());
        System.out.println("Especial: "+e.especial());
        System.out.println("___________________________________");
    }
}