public class AgedBrieItem extends GlidedRoseItem {
    public AgedBrieItem(Item item) {
        super(item);
    }

    public void updateQuality() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
        if (item.sellIn < 1) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }

    public void updateSellIn() {
        item.sellIn = item.sellIn - 1;
    }
}
