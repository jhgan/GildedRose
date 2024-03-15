public abstract class GlidedRoseItem {
    protected Item item;

    public GlidedRoseItem(Item item) {
        this.item = item;
    }

    public abstract void updateQuality();
}
