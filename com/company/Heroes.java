package com.company;
import java.util.*;

public class Heroes {
    private String hero;
    private int hp;
    private int mp;

    public Heroes(String hero, int hp, int mp){
        this.hero = hero;
        this.hp = hp;
        this.mp = mp;
    }

    public String getHero() {
        return hero;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        List<Heroes> heroesList = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n ; i++){
            String[] heroArray = sc.nextLine().split(" ");

            int heroHP = 0;
            int heroMP = 0;

            if(Integer.parseInt(heroArray[1]) > 100){
                heroHP = 100;
            }
            else{
                heroHP = Integer.parseInt(heroArray[1]);
            }

            if(Integer.parseInt(heroArray[2]) > 200){
                heroMP = 200;
            }
            else{
                heroMP = Integer.parseInt(heroArray[2]);
            }

            Heroes hero = new Heroes(heroArray[0], heroHP, heroMP);

            heroesList.add(hero);
        }

        while(true){
            String command = sc.nextLine();

            if(command.equals("End")){
                heroesList.sort(Comparator.comparing(Heroes::getHp).reversed().thenComparing(Heroes::getHero));

                for(Heroes hero : heroesList){
                    System.out.println(hero.getHero());
                    System.out.println("HP: "+ hero.getHp());
                    System.out.println("MP: " + hero.getMp());
                }

                break;
            }
            else{
                String[] commandArray = command.split(" - ");

                if(commandArray[0].equals("CastSpell")){
                    for(Heroes hero : heroesList){
                       if(hero.getHero().equals(commandArray[1])){
                           if(hero.getMp() >= Integer.parseInt(commandArray[2])){
                               hero.setMp(hero.getMp() - Integer.parseInt(commandArray[2]));
                               System.out.printf("%s has successfully cast %s and now has %d MP!%n",
                                       commandArray[1], commandArray[3], hero.getMp());
                           }
                           else{
                               System.out.printf("%s does not have enough MP to cast %s!%n",
                                       commandArray[1], commandArray[3]);
                           }
                       }
                    }
                }
                else if(commandArray[0].equals("TakeDamage")){
                    for(int i = 0; i < heroesList.size(); i++){
                        if(heroesList.get(i).getHero().equals(commandArray[1])){
                            if(heroesList.get(i).getHp() > Integer.parseInt(commandArray[2])){
                                heroesList.get(i).setHp(heroesList.get(i).getHp() - Integer.parseInt(commandArray[2]));
                                System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                        commandArray[1], Integer.parseInt(commandArray[2]),
                                        commandArray[3], heroesList.get(i).getHp());
                            }
                            else{
                                System.out.printf("%s has been killed by %s!%n", commandArray[1], commandArray[3]);
                                heroesList.remove(i);
                            }
                        }
                    }
                }
                else if(commandArray[0].equals("Recharge")){
                    for(Heroes hero : heroesList){
                        if(hero.getHero().equals(commandArray[1])){
                            if(hero.getMp() + Integer.parseInt(commandArray[2]) > 200){
                                System.out.printf("%s recharged for %d MP!%n",
                                        commandArray[1], 200 - hero.getMp());
                                hero.setMp(200);
                            }
                            else{
                                hero.setMp(hero.getMp() + Integer.parseInt(commandArray[2]));
                                System.out.printf("%s recharged for %d MP!%n",
                                        commandArray[1], Integer.parseInt(commandArray[2]));
                            }
                        }
                    }
                }
                else if(commandArray[0].equals("Heal")){
                    for(Heroes hero : heroesList){
                        if(hero.getHero().equals(commandArray[1])){
                            if(hero.getHp() + Integer.parseInt(commandArray[2]) > 100){
                                System.out.printf("%s healed for %d HP!%n",
                                        commandArray[1], 100 - hero.getHp());
                                hero.setHp(100);
                            }
                            else{
                                hero.setHp(hero.getHp() + Integer.parseInt(commandArray[2]));
                                System.out.printf("%s healed for %d HP!%n",
                                        commandArray[1], Integer.parseInt(commandArray[2]));
                            }
                        }
                    }
                }
            }
        }
    }
}
