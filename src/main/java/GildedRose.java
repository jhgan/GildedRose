class GildedRose {
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateQuality(item);
            updateSellIn(item);
        }
    }

    private static void updateQuality(Item item) {
        GlidedRoseItem glidedRoseItem = getGlidedRoseItem(item);
        glidedRoseItem.updateQuality();
    }

    private static GlidedRoseItem getGlidedRoseItem(Item item) {
        GlidedRoseItem glidedRoseItem;
        if (item.name.equals(AGED_BRIE)) {
            glidedRoseItem = new AgedBrieItem(item);
        } else if (item.name.equals(BACKSTAGE_PASSES)) {
            glidedRoseItem = new BackstagePassesItem(item);
        } else if (item.name.equals(SULFURAS)) {
            glidedRoseItem = new SulfurasItem(item);
        } else {
            glidedRoseItem = new NormalItem(item);
        }
        return glidedRoseItem;
    }

    private static void updateSellIn(Item item) {
        if (item.name.equals(SULFURAS)) {
        } else {
            item.sellIn = item.sellIn - 1;
        }
    }
}