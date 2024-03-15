public class BackstagePassesItem extends GlidedRoseItem {
    public BackstagePassesItem(Item item) {
        super(item);
    }

    public void updateQuality() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;

            if (item.sellIn < 11) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }

            if (item.sellIn < 6) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
        }

        if (item.sellIn < 1) {
            item.quality = 0;
        }
    }
}
