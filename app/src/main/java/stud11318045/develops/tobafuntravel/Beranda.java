package stud11318045.develops.tobafuntravel;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class Beranda  extends AppCompatActivity {
    private int[] mImages = new int[]{
            R.drawable.air_terjun,
            R.drawable.bukit_holbug_samosir,
            R.drawable.menara_padang_tele_samosir,
            R.drawable.museum_batak_balige,
            R.drawable.pantai_bul_bul,
            R.drawable.pasir_putih_parbaba
    };
    private String[] mImagesTitle = new String[]{
            "Air Terjun", "bukit Holbug Samosir",
            "Menara Padang Tele Samosir", "Museum Batak Balige",
            "Pantai Bulbu-Bul", "Pasir Putih Parbaba"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beranda);

        CarouselView carouselView = findViewById(R.id.carousel);
        carouselView.setPageCount(mImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);
            }
        });
        carouselView.setImageClickListener(new ImageClickListener() {

            public void onClick(int position) {
                Toast.makeText(Beranda.this, mImagesTitle[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}

