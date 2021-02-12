package com.example.rtoinfoapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*RtoInfo

        1.Vehicle Owner Info
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : car_brands
Parameter : no
------------------------------------------------
2.License Info
Base Url : https://www.tradetu.com/bus_api/public/api/v1/vaahan/
Post : searchLicenseDetails
Parameter :
key : licenseNo | value : MH1420090030945
key : dob | value : 17-07-1974
------------------------------------------------
3.Driving School
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : drivingSchools
Parameter :
key : cityId | value : 51
(limited city's driving school available only)
------------------------------------------------
4.Fuel Price
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : fuelPrices
Parameter : 51(city id of Ahmedabad)(use Url for changing link at run time )
------------------------------------------------
5.State & City List
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : fuelCities
Parameter : no
------------------------------------------------
6.Rto Office by City
Base Url : https://www.tradetu.com/bus_api/public/api/v1/vaahan/
Get : rtoInformation
Parameter : no
------------------------------------------------
7.Rto Questions Bank
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : rtoQuestions
Parameter :
key : lang | value : en
------------------------------------------------
8.Traffic Signal
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : trafficSignals
Parameter :
key : lang | value : en
------------------------------------------------

Car Api

1.Car Brand
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : car_brands
Parameter : no
-----------------------------------------------
2.Brand Models
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : car_models
Parameter :
key : brandId | value : 3
-----------------------------------------------
3.Car Model Details
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : car_model
Parameter :
key : modelId | value : 245
-----------------------------------------------
4.Model Varients
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : car_variants
Parameter :
key : modelId | value : 245
-----------------------------------------------
5.Varient Detail
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : car_variant
Parameter :
key : variantId | value : 1240
-----------------------------------------------
6.Car Varient compare
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : compare_car_variants
Parameter :
key : variantId_x | value : 1240
key : variantId_y | value : 1241
-----------------------------------------------
7.Car Dealers
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : car_dealers
Parameter :
key : brandId | value : 3
key : cityId | value : 51
optional : offset,count
-----------------------------------------------
8.Car Assesories
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : car_accessories
Parameter :
key : brandId | value : 3
-----------------------------------------------
9. Car Service Center
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : car_service_centers
Parameter :
key : brandId | value : 3
key : cityId  | value : 51
-----------------------------------------------
10. Latest Car
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : popular_cars_bikes
Parameter : no
-----------------------------------------------


Bike Api

1.Bike Brands
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : bike_brands
Parameter :
key : no
------------------------------------------------
2.Brand Models
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : bike_models
Parameter :
key : brandId | value : 3
------------------------------------------------
3.Model Detail
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : bike_model
Parameter :
key : modelId | value : 17
------------------------------------------------
4.Bike Varient
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : bike_variants
Parameter :
key : modelId | value : 17
------------------------------------------------
5.Varient Detail
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : bike_variant
Parameter :
key : variantId | value : 7
------------------------------------------------
6.Bike Variant Comparison
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : compare_bike_variants
Parameter :
key : variantId_x | value : 6
key : variantId_y | value : 7
------------------------------------------------
7.Bike Dealers
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : bike_dealers
Parameter :
key : brandId | value : 3
key : cityId | value : 51
------------------------------------------------
8.Bike Service Center
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : bike_service_centers
Parameter :
key : brandId | value : 3
key : cityId | value : 51
------------------------------------------------
9.Bike Assesories
Base Url : https://www.tradetu.com/rto/api/v1.0/
Get : bike_accessories
Parameter :
key : brandId | value: 3
------------------------------------------------

         */
    }
}