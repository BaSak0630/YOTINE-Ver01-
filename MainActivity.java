package ga.kimdh.yotineuserver02;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap){
        this.googleMap = googleMap;
        LatLng Center = new LatLng(35.267060 ,129.085442);
        LatLng schoolBusStop = new LatLng(35.267497, 129.080308);
        LatLng oeseongDormitory = new LatLng(35.269923 ,129.085253 );
        LatLng beomeosa = new LatLng(35.272811, 129.092510);
        LatLng namsan = new LatLng(35.265219 ,129.092313);
        LatLng namsanFireStation= new LatLng(35.261057, 129.087109);

        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Center));
        googleMap.moveCamera(CameraUpdateFactory.zoomTo(15));

        MarkerOptions markerscho0lBusStop = new MarkerOptions().position(schoolBusStop).title("셔틀 졍류소");
        googleMap.addMarker(markerscho0lBusStop);
        MarkerOptions markeroeseongDormitory = new MarkerOptions().position(oeseongDormitory).title("외성 기숙사");
        googleMap.addMarker(markeroeseongDormitory);
        MarkerOptions markerbeomeosa = new MarkerOptions().position(beomeosa).title("범어사 역");
        googleMap.addMarker(markerbeomeosa);
        MarkerOptions markernamsan = new MarkerOptions().position(namsan).title("남산 역");
        googleMap.addMarker(markernamsan);
        MarkerOptions markernamsanFireStation = new MarkerOptions().position(namsanFireStation).title("남산 소방서");
        googleMap.addMarker(markernamsanFireStation);
    }
}
