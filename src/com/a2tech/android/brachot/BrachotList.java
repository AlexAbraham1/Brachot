package com.a2tech.android.brachot;

import java.util.TreeMap;

/**
 * This is a class containing the list of all the foods and their brachot
 */
public class BrachotList {

    private static TreeMap<String, String[]> brachot = generateList();

    public static void main(String[] args) {
        BrachotList a = new BrachotList();
        a.printList();
    }
    public BrachotList()
    {

    }

    private static TreeMap<String, String[]> generateList()
    {
        TreeMap<String, String[]> list = new TreeMap<String, String[]>();

        //A
        list.put("Ale", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Alfalfa Sprouts", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("All Bran - Original (Kellogg's Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("All Bran - Bran Buds (Kellogg's Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("All Bran - Complete Oat Flakes (Kellogg's Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("All Bran - Complete Wheat Flakes (Kellogg's Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Almond (Including Chocolate Covered)", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Almond Delight (Ralston Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Alpha Bits (Post Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Anchovies", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Apple", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Apple Chips (Real Apples)", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Apple Cider", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Apple Cinnamon Cheerios (General Mills Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Apple Jacks (Kellogg's Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Apple Kugel (Flour for Flavor/Sustenance)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Apple Kugel (Flour as a Binder)", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Apple-Noodle Kugel", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Apple Juice", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Apple Pie (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Apple Pie (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkas Hamazon"});
        list.put("Apple Raisin Crisp (Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Apple Sauce (Strained)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Apple Sauce (Not Strained)", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Apple Sticks (Dietary Snack)", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Apple Strudel", new String[]{"Mezonos", "Borei Nefashos"});
        list.put("Apple Wine", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Apple Zings (Malt-O-Meal Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Apple-Beet Salad (Beets Majority)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Apple-Beet Salad (Apples Majority)", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Apricot", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Apricot Jam/Jelly With Fruit Pieces", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Apricot Jam/Jelly W/O Fruit Pieces", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Apricot Nectar", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Apricot Preserves (With Fruit Pieces)", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Artichoke", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Asparagus", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Asparagus Soup", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Artificial Meat", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Aspirin", new String[]{"No Bracha", "No Bracha"});
        list.put("Aspirin, Children's (If pleasant tasting)", new String[]{"Shehakol", "No Bracha"});
        list.put("Aubergine", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Autumn Wheat (Kashi Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Avocado", new String[]{"Haeitz", "Borei Nefashos"});

        //B
        list.put("Baby Food (Pureed)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Bagel", new String[]{"Hamotzee", "Birkas Hamazon"});
        list.put("Bagel Chips (Commercially Made)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Bagel Chips (Leftover Bagels)", new String[]{"Hamotzee", "Birkas Hamazon"});
        list.put("Baguette", new String[]{"Hamotzee", "Birkas Hamazon"});
        list.put("Baked Apple", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Baked Beans", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Bamba", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Bamboo Shoots", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Banana", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Banana Chips", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Banana Bread", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Banana Chips", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Banana Nut Cheerios (General Mills Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Banana Nut Crunch (Post Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Banana Split", new String[]{"Haadama & Shehakol", "Borei Nefashos"});
        list.put("Barley (Cooked)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Barley (Raw, Fresh)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Barley Soup (Clear Soup)", new String[]{"Shehakol-liquid & Mezonos-Barley.", "Al Hamichya"});
        list.put("Barley Soup (Not Clear Soup)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Basic 4 (General Mills Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Basil", new String[]{"Shehakol", "No Bracha"});
        list.put("Bay Leaves", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Bean Soup", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Bean Sprouts", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Beans (All)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Beef Stew (Small Pieces & Beef Majority)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Beef Stew (Small Pieces & Potato Majority)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Beef Stew (Large Pieces)", new String[]{"Shehakol & Haadama", "Borei Nefashos"});
        list.put("Beer", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Beet", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Berry Berry Kix (General Mills Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Berry Colossal Crunch (Malt-O-Meal Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Bissli (Grain Flour)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Bissli (Corn Flour)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Biscuit (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Biscuit (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkas Hamazon"});
        list.put("Black Pepper (Dry)", new String[]{"No Bracha", "No Bracha"});
        list.put("Black Pepper (Fresh)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Blackberry", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Blackberry Wine", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Black Radishes", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Black Sapote", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Black-Eyed Peas", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Blintzes (All)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Blueberry", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Blueberry Muffin Tops (Malt-O-Meal Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Bologna", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Borekas (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Borekas (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Borscht (Clear/Small Beet Particles)", new String[]{"Shehakol", "No Bracha"});
        list.put("Borscht (Pieces of Beet)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Borscht (Pieces of Potato)", new String[]{"Shehakol & Haadama", "Borei Nefashos"});
        list.put("Boston Cream Pie", new String[]{"Shehakol on Cream, Mezonos on Crust", "Borei Nefashos"});
        list.put("Boston Lettuce", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Bourbon", new String[]{"Shehakol", "No Bracha"});
        list.put("Bran", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Bran Chex (General Mills Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Bran Flakes (Post Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Bran Flakes (Kemach Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Bran Flakes (Taanug Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Bran Muffins (Without Flour)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Bran Muffins (With Flour K'Vias Seudah)", new String[]{"Hamotzee", "Birkas Hamazon"});
        list.put("Bran Muffins (With Flour NOT K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Brandy (Even Wine Brandy)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Brazil Nut", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Bread", new String[]{"Hamotzee", "Birkas Hamazon"});
        list.put("Bread Crumbs", new String[]{"Hamotzee", "Birkas Hamazon"});
        list.put("Breaded Cutlets/Flounder (On Chicken/Meat/Fish)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Breaded Cutlets/Flounder (On Crust)", new String[]{"Mezonos", "No Bracha"});
        list.put("Bread Kugel", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Bread Sticks (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Bread Sticks (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkas Hamazon"});
        list.put("Bread Stuffing (Bread Crumbs)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Breaded Eggplant", new String[]{"Haadama-Eggplant, THEN Mezonos-Crust", "Borei Nefashos"});
        list.put("Breadfruit", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Broccoli", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Broccoli Quiche (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Broccoli Quiche (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Brownies (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Brownies (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkas Hamazon"});
        list.put("Brown Rice (Normally)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Brown Rice (Softened/Partially Lost Form)", new String[]{"Mezonos", "Borei Nefashos"});
        list.put("Brussels Sprouts", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Bubble Gum", new String[]{"Shehakol", "No Bracha"});
        list.put("Buckwheat (Kasha)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Bulgur (Cooked)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Bunch-O-Krunch (Kemach Cereal)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Butter", new String[]{"Shehakol", "No Bracha"});
        list.put("Buttermilk", new String[]{"Shehakol", "Borei Nefashos"});

        //C
        list.put("Cabbage", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Cabbage Soup", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Cabbage Strudel", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cactus Fruit", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Cake (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cake (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Calzone (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Calzone (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Candy Corn", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Canistel", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Cannoli", new String[]{"Mezonos on Wafer & Shehakol on Ice Cream", "Al Hamichya & Borei Nefashos"});
        list.put("Cantaloupe", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Cap'n Crunch (Quaker Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cap'n Crunch Crunch Berries (Quaker Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cap'n Crunch Peanut Butter (Quaker Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Capers", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Caramel", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Caramel Candy", new String[]{"Shehakol", "No Bracha"});
        list.put("Carob", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Carob Cake", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Carp", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Carrot Cake (Without Flour)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Carrot Cake (With Flour Without K'Vias Seudah)", new String[]{"Mezonos", "Birkat Hamazon"});
        list.put("Carrot Cake (With Flour With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Carrot Juice", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Carrots", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Casaba Melon", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Cashews", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Casserole (With Noodles)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Casserole (Without Noodles)", new String[]{"Mezonos", "Borei Nefashos"});
        list.put("Cauliflower", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Celery", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Celery Soda", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Celery Soup", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Challah", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Champagne", new String[]{"Hagafen", "Al Hagafen"});
        list.put("Charif (Can Be Eaten Alone)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Charif (Can't Be Eaten Alone)", new String[]{"No Bracha", "No Bracha"});
        list.put("Cheerios (General Mills Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cheese", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cheese Blintzes", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cheese Cake (Crust for Flavor)", new String[]{"Mezonos", "Borei Nefashos (Not Enough Crust)"});
        list.put("Cheese Cake (Crust for Structure)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cheese Danish (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cheese Danish (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Cheetos (Elite)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cherimoya", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Cherries", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Cherry Cake (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cherry Cake (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Cherry Danish (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cherry Danish (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Cherry Pie (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cherry Pie (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Cherry Wine", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chestnuts", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Chewing Gum", new String[]{"Shehakol", "No Bracha"});
        list.put("Chewy Granola Bars (Quaker)", new String[]{"Haadama", "Debate (Don't eat K'Zayit within 4 minutes!)"});
        list.put("Chicken", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chicken Ala King", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chicken Chow Mein (With Noodles & Vegetable Majority)", new String[]{"Mezonos-Noodles, Haadama-Vegetable", "Al Hamichya"});
        list.put("Chicken Chow Mein (With Noodles & Chicken Majority)", new String[]{"Mezonos-Noodles, Shehakol-Chicken", "Al Hamichya"});
        list.put("Chicken Chow Mein (Without Noodles & Vegetable Majority)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Chicken Chow Mein (Without Noodles & Chicken Majority)", new String[]{"Shehakol", "Al Hamichya"});
        list.put("Chicken Fat (Grebenes)", new String[]{"Shehakol", "No Bracha"});
        list.put("Chicken Fricassee", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chicken Pie (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Chicken Pie (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Chicken Salad (Chicken Majority)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chicken Salad (Vegetables Majority)", new String[]{"Haadama", "Birkat Hamazon"});
        list.put("Chicken Soup (Majority Noodles)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Chicken Soup (With Noodles/Kneidlach/Soup Nuts)", new String[]{"Shehakol-Soup & Mezonos-Noodles", "Al Hamichya"});
        list.put("Chicken Soup (Without Noodles/Kneidlach/Soup Nuts)", new String[]{"Shehakol OR Individual Brachot", "Borei Nefashos"});
        list.put("Chickpeas (Arbes)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Chicory", new String[]{"Haadama", "No Bracha"});
        list.put("Chicory Lettuce", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Chili Con Carne", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chinese Cabbage", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Chinese Noodles", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Chives", new String[]{"Shehakol", "No Bracha"});
        list.put("Choco Chippers (Kemach Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Choco Munch (Taanug Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chocolate", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chocolate Bar (All)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chocolate Cake (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Chocolate Cake (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Chocolate Cheerios (General Mills Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chocolate Chex (General Mills Cereal)", new String[]{"Mezonos", "Borei Nefashos"});
        list.put("Chocolate Coated Coconut Bar", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Chocolate Coconut Rings", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chocolate Coffee Beans", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chocolate Covered Almonds (Almonds Stronger Desire)", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Chocolate Covered Almonds (Chocolate Stronger Desire)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chocolate Covered Almonds (No Preference)", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Chocolate Eclair (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Chocolate Eclair (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Chocolate Fudge", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chocolate Jelly Rings", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chocolate Lentils", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chocolate Milk", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chocolate Mousse", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chocolate O's (Cascadian Farms Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Chocolate Pudding", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chocolate Spread", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chocolate Yeast Cake (Kokosh - Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Chocolate Yeast Cake (Kokosh - With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Cholent (SMALL PIECES With Barley)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cholent (SMALL PIECES Without Barley)", new String[]{"Primary Ingredient", "Borei Nefashos"});
        list.put("Cholent (LARGE PIECES With Barley)", new String[]{"Individual Brachot", "Al Hamichya"});
        list.put("Cholent (LARGE PIECES Without Barley)", new String[]{"Individual Brachot", "Borei Nefashos"});
        list.put("Chopped Liver", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Chremzel", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Chumous", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cider", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cinna-Graham Honeycomb (Post Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cinnabon Cereal (Kellogg's Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cinnamon (With Sugar)", new String[]{"Haadama", "No Bracha"});
        list.put("Cinnamon Burst Cheerios (General Mills Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cinnamon Chex (General Mills Cereal)", new String[]{"Mezonos", "Borei Nefashos"});
        list.put("Cinnamon Life (Quaker Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cinnamon Mighty Bites (Kashi Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cinnamon Roll (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cinnamon Roll (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Cinnamon Toast Crunch (General Mills Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Clementines", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Clif Bar", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Cocoa", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cocoa Krispies (Kellogg's Cereal)", new String[]{"Mezonos", "Borei Nefashos"});
        list.put("Cocoa Munchees (Kemach Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cocoa Pebbles (Post Cereal)", new String[]{"Mezonos", "Borei Nefashos"});
        list.put("Cocoa Powder (Unsweetened)", new String[]{"No Bracha", "No Bracha"});
        list.put("Cocoa Puffs (General Mills Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Coconut", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Coconut Milk (Eaten Separately from Coconut)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cod", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Coffee", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Coffee Cake (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Coffee Cake (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Cognac", new String[]{"Shehakol", "No Bracha"});
        list.put("Coleslaw", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Cooked Wine", new String[]{"Hagafen", "Al Hagafen"});
        list.put("Cookie Crisp (General Mills Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cookies (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cookies (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Coriander", new String[]{"Shehakol", "No Bracha"});
        list.put("Corn", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Corn Blast (Taanug Cereal)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Corn Cakes (Rice Cakes from Corn)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Corn Chex (General Mills Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Corn Chips", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Corn Flakes (Kellogg's Cereal)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Corn Flakes (Kemach Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Corn Flakes (Taanug Cereal)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Corn Fritters", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Corn Muffins (Grain Flour Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Corn Muffins (Grain Flour With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Corn Muffins (Without Grain Flour)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Corn Pops (Kellogg's Cereal MADE IN U.S)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Corn Pops (Kellogg's Cereal MADE IN CANADA)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Corn Soup", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Corned Beef", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cottage Cheese", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cotton Candy", new String[]{"Shehakol", "No Bracha"});
        list.put("Cough Drops (Flavored)", new String[]{"Shehakol", "No Bracha"});
        list.put("Country Corn Flakes (General Mills Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Couscous", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Crackers (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Crackers (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Cracklin' Oat Bran (Kellogg's Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Craisins", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Cranberries", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Cranberry Almond Crunch (Post Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cranberry Juice", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cranberry Relish", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Cranshaw Melons", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Cream Cheese", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cream Puffs (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cream Puffs (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Cream of Mushroom Soup (Without Noodles)", new String[]{"Shehakol", "No Bracha"});
        list.put("Cream of Mushroom Soup (With Noodles)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cream of Potato Soup", new String[]{"Shehakol", "No Bracha"});
        list.put("Crisp Rice (Quaker Cereal)", new String[]{"Mezonos", "Borei Nefashos"});
        list.put("Crisp Rice (Kemach Cereal)", new String[]{"Mezonos", "Borei Nefashos"});
        list.put("Crisp Rice (Taanug Cereal)", new String[]{"Mezonos", "Borei Nefashos"});
        list.put("Crispix (Kellogg's Cereal)", new String[]{"Mezonos - Darker Side & Haadama - Lighter Side", "Borei Nefashos"});
        list.put("Crispy Rice (Malt-O-Meal Cereal)", new String[]{"Mezonos", "Borei Nefashos"});
        list.put("Croissant (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Croissant (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Cruller", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Crunchy Corn Bran (Quaker Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Crunchy Nut-Golden Honey Nut (Kellogg's Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Crunchy Nut-Roasted Nut & Honey)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Cucumber Salad", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Cucumber", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Cumin", new String[]{"Shehakol", "No Bracha"});
        list.put("Cupcake Pebbles (Post Cereal)", new String[]{"Mezonos", "Borei Nefashos"});
        list.put("Cupcake (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Cupcake (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Currants", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Custard", new String[]{"Shehakol", "Borei Nefashos"});

        //D
        list.put("Danish (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Danish (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Date Bread (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Date Bread (With K'Vias Seudah", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Date Cookies (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Date Cookies (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Dates", new String[]{"Haeitz", "Al Haeitz"});
        list.put("Wise - Dipsy Doodles", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Dora the Explorer (General Mills Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Doughnut", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Dragon Fruit", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Dried Banana Chips", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Dried Fruit (Dates, Figs, & Raisins)", new String[]{"Haeitz", "Al Haeitz"});
        list.put("Dried Fruit (Other)", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Dried Fruit (Papaya)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Dried Fruit (Pineapple)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Duck", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Dyno-Bytes - Cocoa (Malt-O-Meal Cereal)", new String[]{"Mezonos", "Borei Nefashos"});
        list.put("Dyno-Bytes - Fruity (Malt-O-Meal Cereal)", new String[]{"Mezonos", "Borei Nefashos"});

        //E
        list.put("Eclair (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Eclair (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Egg Barley", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Egg Drops (Nockerlach)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Egg Matzo (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Egg Matzo (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Egg Nog", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Egg Noodles", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Egg Omelet", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Egg Rolls", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Egg Salad", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Eggplant", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Eggplant Parmigiana (Without Matzo Meal)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Eggplant Parmigiana (With Matzo Meal)", new String[]{"Haadama-Eggplant, THEN Mezonos-Crust", "Borei Nefashos"});
        list.put("Eggs", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Elite - Egozi", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Enchiladas (Corn Flour)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Endives", new String[]{"Haadama", "Borei Nefashos"});
        list.put("English Muffin", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Escaroles", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Espresso", new String[]{"Shehakol", "IF PROPER SHIUR - Borei Nefashos"});
        list.put("Etrog Jam", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Ezekiel Bread", new String[]{"Hamotzee", "Birkat Hamazon"});
        //F
        list.put("Falafel Sandwich", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Falafel Balls", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Farfel", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Farina (Non-Drinkable)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Farina (Drinkable)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Farmer Cheese", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Fennel Seeds", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Fiber One - Original (General Mills Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Figs", new String[]{"Haeitz", "Al Haeitz"});
        list.put("Filberts", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Fish", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Fish Amandine", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Fish Balls", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Fish Cake", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Fish Sticks", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Fish and Chips", new String[]{"Fish - Shehakol, Chips - Haadama", "Borei Nefashos"});
        list.put("Flat Breads (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Flat Breads (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Flax Seeds", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Flounder", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Frankfurters", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Franks in Blankets (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Franks in Blankets (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("French Bread", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("French Fried Potatoes", new String[]{"Haadama", "Borei Nefashos"});
        list.put("French Toast", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("French Toast Crunch (General Mills Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Fruit Loops (Kellogg's Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Frosted Cheerios (General Mills Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Frosted Flakes (Kellogg's Cereal)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Frosting", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Fruit Cake (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Fruit Cake (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Fruit Circles (Taanug Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Fruit Cocktail (Commercially Produced)", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Fruit Cocktail (Home-Made)", new String[]{"Primary Ingredient", "Borei Nefashos"});
        list.put("Fruit Harvest Strawberry Blueberry (Kellogg's Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Fruit Leather", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Fruit Preserves", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Fruit Punch", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Fruit Soup (Large Pieces)", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Fruit Soup (No Pieces)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Fruit Whirls (Kemach Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Fruit Wrinkles", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Fruit and Bran (Post Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Fruity Cheerios (General Mills Cereal)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Fruity Pebbles (Post Cereal)", new String[]{"Mezonos", "Borei Nefashos"});
        list.put("Fudge", new String[]{"Shehakol", "Borei Nefashos"});
        //G
        list.put("Garlic", new String[]{"Shehakol", "No Bracha"});
        list.put("Garlic Bread", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Garlic Knots (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Garlic Knots (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Gefilte Fish", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Gherkins", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Giblets", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Ginger (Fresh or Dry)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Ginger Ale", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Ginger Bread (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Ginger Bread (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Gnocchi", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Go Lean - Original (Kashi Cereal)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Go Lean Crisp (Kashi Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Go Lean Crunch (Kashi Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Goji Berries", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Golden Crisp (Post Cereal)", new String[]{"Mezonos or Haadama", "Borei Nefashos"});
        list.put("Golden Grahams (General Mills Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Good Friends (Kashi Cereal)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Goose", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Gooseberries", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Goulash (Large Pieces)", new String[]{"Haadama on Potatoes, Shehakol on Meat", "Borei Nefashos"});
        list.put("Goulash (Small Pieces Meat Majority)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Goulash (Small Pieces Potatoes Majority)", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Graham Crackers (Without K'Vias Seudah)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Graham Crackers (With K'Vias Seudah)", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Grape Juice", new String[]{"Hagafen", "Al Hagafen"});
        list.put("Grape Juice Ices", new String[]{"Shehakol", "No Bracha"});
        list.put("Grape Nuts (Post Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Grapefruit", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Grapefruit Juice", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Grapes", new String[]{"Haeitz", "Al Haeitz"});
        list.put("Grasshopper (Only if Kosher)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Gravy (Meat)", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Great Grains - Cranberry Almond Crunch (Post Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Great Grains - Crunchy Pecans (Post Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Great Grains - Raisins Dates and Pecans (Post Cereal)", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Green Beans", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Green Peas", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Griddle Cake", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Grilled Cheese Sandwich", new String[]{"Hamotzee", "Birkat Hamazon"});
        list.put("Grits", new String[]{"Mezonos", "Al Hamichya"});
        list.put("Groats", new String[]{"Haadama", "Borei Nefashos"});
        list.put("Guava", new String[]{"Haeitz", "Borei Nefashos"});
        list.put("Guava Nectar", new String[]{"Shehakol", "Borei Nefashos"});
        list.put("Gum", new String[]{"Shehakol", "No Bracha"});
        list.put("Gumdrops", new String[]{"Shehakol", "No Bracha"});

        //H

        //I

        //J

        //K

        //L

        //M

        //N

        //O

        //P
        list.put("Pepper (Vegetable)", new String[]{"Haadama", "Borei Nefashos"});
        //Q

        //R

        //S

        //T

        //U

        //V

        //W

        //Y

        //Z

        return list;

    }

    public void printList()
    {
        for(String str : brachot.keySet()){
            System.out.print(str + ": ");
            String rishona = brachot.get(str)[0];
            String achrona = brachot.get(str)[1];
            System.out.println(rishona + " " + achrona);
        }
        System.out.println("Total: " + brachot.size());
    }
}
