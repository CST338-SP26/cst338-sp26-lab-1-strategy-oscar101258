import java.util.HashMap;

/**
 *
 * @author Oscar
 * 08/27/25
 * 0.1.0
 */
public abstract class Monster {
    private Integer hp;
    private Integer xp;
    private Integer maxHP;
    private  HashMap<String, Integer> items ;
    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }


    public boolean equals(Object o) {
        return true;
    }
    public int hashCode() {
        return 0;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(Integer maxHP) {
        this.maxHP = maxHP;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "has : hp=" + hp + "/" + maxHP;
    }
}
