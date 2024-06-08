import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class DnDCharacter {
    private static final int INITIAL_HITPOINTS = 10;
    private static final int TOP_SCORES_COUNT = 3;
    private static final int NUMBER_OF_DICE_ROLLS = 4;
    private static final int DICE_MIN_VALUE = 1;
    private static final int DICE_MAX_VALUE = 7;
    private static final int INITIAL_SUM = 0;
    private static final int MODIFIER_BASE = 10;
    private static final int DIVISOR = 2;

    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitpoints;

    private final Random random;

    public DnDCharacter() {
        this.random = new Random();

        this.strength = this.generateAbilityScore();
        this.dexterity = this.generateAbilityScore();
        this.constitution = this.generateAbilityScore();
        this.intelligence = this.generateAbilityScore();
        this.wisdom = this.generateAbilityScore();
        this.charisma = this.generateAbilityScore();

        this.hitpoints = INITIAL_HITPOINTS + this.modifier(this.constitution);
    }

    private int generateAbilityScore() {
        return this.ability(this.rollDice());
    }

    int ability(List<Integer> scores) {
        return scores.stream()
                .sorted(Collections.reverseOrder())
                .limit(TOP_SCORES_COUNT)
                .reduce(INITIAL_SUM, Integer::sum);
    }

    List<Integer> rollDice() {
        return this.random.ints(NUMBER_OF_DICE_ROLLS, DICE_MIN_VALUE, DICE_MAX_VALUE)
                .boxed()
                .collect(Collectors.toList());
    }

    public int modifier(int input) {
        return Math.floorDivExact(Math.subtractExact(input, MODIFIER_BASE), DIVISOR);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return this.hitpoints;
    }
}
