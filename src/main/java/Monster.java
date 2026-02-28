import java.util.HashMap;

/**
 *
 * @author Oscar
 * 08/27/25
 * 0.1.0
 */
public class Monster {
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
}
