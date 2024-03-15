public class NormalItem extends GlidedRoseItem {
    public NormalItem(Item item) {
        super(item);
    }

    public void updateQuality() {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }

        if (item.sellIn < 1) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }

    public void updateSellIn() {
    }
}
