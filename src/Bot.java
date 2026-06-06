import java.util.Objects;

public class Bot {

    private String botName;
    private int damage;
    private int level;

    public Bot(String botName, int damage, int level) {
        this.botName = botName;
        this.damage = damage;
        this.level = level;
    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Bot{" +
                "botName='" + botName + '\'' +
                ", damage=" + damage +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bot bot = (Bot) o;
        return damage == bot.damage && level == bot.level && Objects.equals(botName, bot.botName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(botName, damage, level);
    }
}
