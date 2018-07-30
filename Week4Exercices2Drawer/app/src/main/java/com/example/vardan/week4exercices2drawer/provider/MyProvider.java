package com.example.vardan.week4exercices2drawer.provider;

import android.content.Context;

import com.example.vardan.week4exercices2drawer.model.ListModel;
import com.example.vardan.week4exercices2drawer.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyProvider {
    public static List<ListModel> list = new ArrayList<>();
    public static int position;

    public static List<ListModel> getUsersList(Context context) {
        if (!list.isEmpty()) {
            list.clear();
        }


        list.add(new ListModel("Nike Hypervenom Bronze", new String[]{"http://www.bikeanalysis.com/images/pic/FHu4fwthdvM7_3349.jpg", "https://cdn3.volusion.com/goz35.avhz4/v/vspfiles/photos/SIYNI749920-903-4.jpg?1456231556", "https://cdn3.volusion.com/goz35.avhz4/v/vspfiles/photos/SIYNI749920-903-5.jpg?1456231556"}, context.getString(R.string.hypervenom), "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4", 3, "shoes", false, false));
        list.add(new ListModel("Nike Lunar", new String[]{"https://cdn3.volusion.com/goz35.avhz4/v/vspfiles/photos/SI-NI643273-070-2.jpg?1456231556", "https://cdn3.volusion.com/goz35.avhz4/v/vspfiles/photos/SI-NI643273-070-4.jpg?1456231556", "https://cdn3.volusion.com/goz35.avhz4/v/vspfiles/photos/SI-NI643273-070-6.jpg?1456231556"}, context.getString(R.string.lunar), "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4", 2, "shoes", false, false));
        list.add(new ListModel("Nike Lunar Gato", new String[]{"https://images.solecollector.com/complex/image/upload/xutuojfmcvdm6h63jzlz.jpg", "http://www.ugeavisen.net/i.php?https://images.solecollector.com/complex/image/upload/ypwjledwexwjwwvg7yc4.jpg", "http://giayfutsal.com.vn/public/images/product/1257624-%C4%91%E1%BB%8F.jpg"}, context.getString(R.string.lunar_gato), "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4", 2, "shoes", false, false));
        list.add(new ListModel("Audi Electric Bike", new String[]{"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLlEk05JQJpZCYrFXMf4-PhD16bGBFuJYVtQzfJ6YA2nu1dAuN", "https://www.extremetech.com/wp-content/uploads/2012/05/audi-e-bike-640x353.jpg", "https://www.mountainbike-magazin.de/sixcms/media.php/6/UB-Pedelec-Prototyp-Audi-Woerthersee-1.jpg"}, context.getString(R.string.audi), "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4", 2, "bicycles", false, false));
        list.add(new ListModel("Swatch Sutr400 Red", new String[]{"https://images-na.ssl-images-amazon.com/images/I/81PFzjjg3jL._UY445_.jpg", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQrOU9xXhAL62s17VXbu_BiAUWg1UwQezt4kJZlFhdXkGqBAGZT", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnI1poehIhAMhzAnxHJUAI93kU1HDw2LzmrFaZO-u-uMnZ6C_3"}, context.getString(R.string.swatch), "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4", 2, "watches", false, false));
        list.add(new ListModel("Nike Rain Jacket Red", new String[]{"http://www.brandmemarketing.co.uk/images/brandmemarketing.co.uk/nike-jacket-blue-force-reflective-silver-bright-crimson-drifit-shield-light-mens-running-clothing-12GM.jpg", "http://www.deverevideo.co.nz/images/cHpAxHeDWm/nike-mens-blue-force-bright-crimson-clothing-shield-light-29CG.jpg", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSgSWHPF7mZOBkEVreTsUx7FsDTmqvqAWNJkUVykmtGhE74x989nQ"}, context.getString(R.string.jacket_red), "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerMeltdowns.mp4", 2, "jackets", false, false));
        list.add(new ListModel("Rolex Milgauss Skull Art", new String[]{"http://www.bespokeluxuryconcept.com/386-thickbox_default/rolex-milgauss-skull-art-poa.jpg", "http://www.bespokeluxuryconcept.com/img/blockslideshow/6.jpg", "https://i1.adis.ws/i/forzieri/rx580015-014-2x-t?$nlpv$"}, context.getString(R.string.rolex), "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/Sintel.mp4", 2, "watches", false, false));
        list.add(new ListModel("Hummer Rally Foldable Hummer Mountain Bike", new String[]{"https://cf3.s3.souqcdn.com/item/2016/11/02/11/80/00/76/item_XL_11800076_17232482.jpg", "https://cf1.s3.souqcdn.com/item/2016/07/14/11/10/33/56/item_XL_11103356_15306995.jpg", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTsshoL_Trujv3FvKdT6FR0PvoEGZLTKCkMjFdglXaYXoAPGGWg1A"}, context.getString(R.string.hummer_bicycle), "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/SubaruOutbackOnStreetAndDirt.mp4", 2, "bicycles", false, false));
        list.add(new ListModel("Nike hiper", new String[]{"https://i.ebayimg.com/images/g/z8QAAOSwESNZ8ggR/s-l300.jpg", "https://static.webshopapp.com/shops/176120/files/087541202/790x592x2/nike-mens-sportswear-tech-knit-windrunner-jacket-c.jpg", "https://static.webshopapp.com/shops/176120/files/087541205/790x592x2/nike-mens-sportswear-tech-knit-windrunner-jacket-c.jpg"}, context.getString(R.string.runner_jacket), "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/TearsOfSteel.mp4", 2, "jackets", false, false));
        list.add(new ListModel("Nike Tech Knit Windrunner ", new String[]{"https://http2.mlstatic.com/nike-elastico-superfly-ic-D_NQ_NP_612615-MLM25287033236_012017-F.jpg", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQH0C5I8iKbmKjRg7Gkwmz3e2FMkrN36-9MvrDZi6r8ZwQaTB0C", "http://cdn3.volusion.com/goz35.avhz4/v/vspfiles/photos/SI-NI641597-001-8.jpg?1456231556"}, context.getString(R.string.hyper_jacket), "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/VolkswagenGTIReview.mp4", 2, "jackets", false, false));
        Collections.shuffle(MyProvider.list);
        return list;
    }


    public static List<ListModel> getCartList() {
        List<ListModel> cartList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getToBasket()) {
                cartList.add(list.get(i));
            }
        }
        return cartList;
    }

    public static List<ListModel> favoriteList() {
        List<ListModel> favoriteList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLiked()) {
                favoriteList.add(list.get(i));
            }
        }
        return favoriteList;
    }

    public static List<ListModel> getCategoryList(String category) {
        List<ListModel> categoryList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCategory().equals(category)) {
                categoryList.add(list.get(i));
            }
        }
        return categoryList;
    }


    public static ListModel getItemPosition() {
        return list.get(position);
    }

}





