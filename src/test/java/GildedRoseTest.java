import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    public static final String NONAME = "noname";
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    @Test
    public void should_be_nothing_when_no_item() {
        Item[] items = new Item[]{};
        GildedRose gildedrose = new GildedRose(items);

        gildedrose.updateQuality();

        assertEquals(0, items.length);
    }

    @Test
    public void noname_sellin_0_quality_0() {
        Item[] items = new Item[]{new Item(NONAME, 0, 0)};
        GildedRose gildedrose = new GildedRose(items);

        gildedrose.updateQuality();

        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }

    @Test
    public void noname_sellin_0_quality_1() {
        Item[] items = new Item[]{new Item(NONAME, 0, 1)};
        GildedRose gildedrose = new GildedRose(items);

        gildedrose.updateQuality();

        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }

    @Test
    public void sulfuras_sellin_0_quality_80() {
        Item[] items = new Item[]{new Item(SULFURAS, 0, 80)};
        GildedRose gildedrose = new GildedRose(items);

        gildedrose.updateQuality();

        assertEquals(0, items[0].sellIn);
        assertEquals(80, items[0].quality);
    }

    @Test
    public void agedBrie_sellin_0_quality_0() {
        Item[] items = new Item[]{new Item(AGED_BRIE, 0, 0)};
        GildedRose gildedrose = new GildedRose(items);

        gildedrose.updateQuality();

        assertEquals(-1, items[0].sellIn);
        assertEquals(2, items[0].quality);
    }

    @Test
    public void backstage_pass_sellin_0_quality_0() {
        Item[] items = new Item[]{new Item(BACKSTAGE_PASS, 0, 0)};
        GildedRose gildedrose = new GildedRose(items);

        gildedrose.updateQuality();

        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }

    @Test
    public void backstage_pass_sellin_0_quality_49() {
        Item[] items = new Item[]{new Item(BACKSTAGE_PASS, 0, 49)};
        GildedRose gildedrose = new GildedRose(items);

        gildedrose.updateQuality();

        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }

    @Test
    public void backstage_pass_sellin_12_quality_0() {
        Item[] items = new Item[]{new Item(BACKSTAGE_PASS, 12, 0)};
        GildedRose gildedrose = new GildedRose(items);

        gildedrose.updateQuality();

        assertEquals(11, items[0].sellIn);
        assertEquals(1, items[0].quality);
    }

    @Test
    public void sulfuras_pass_sellin_m2_quality_80() {
        Item[] items = new Item[]{new Item(SULFURAS, -2, 80)};
        GildedRose gildedrose = new GildedRose(items);

        gildedrose.updateQuality();

        assertEquals(-2, items[0].sellIn);
        assertEquals(80, items[0].quality);
    }

    @Test
    public void agedBrie_pass_sellin_0_quality_50() {
        Item[] items = new Item[]{new Item(AGED_BRIE, 0, 50)};
        GildedRose gildedrose = new GildedRose(items);

        gildedrose.updateQuality();

        assertEquals(-1, items[0].sellIn);
        assertEquals(50, items[0].quality);
    }
}