# BTK-NavigationKotlin

# Kotlin İle Android Mobil Uygulama Geliştirme Eğitimi Temel Seviye (BTK AKADEMİ) Notlarım

## Navigation

> Fragment’ı kullanırken navigation dediğimiz kütüphaneyi ya da framework’ü kullanmak gerekli. Çünkü navigation bizim uygulama içerisinde navigasyon ihtiyacımızı gideriyor. 

> Navigation; uygulama içerisinde nereden nereye bağlantı var, nereden nereye nasıl gidilecek bunları çok daha görsel ve kolay halletmemizi sağlayan bir framework.

> Özellikle fragmentlarla çalışırken veri aktarımı daha zor olabiliyor. 

> Navigation'ı dependencies kısmına eklerken daha düşük veya daha yüksek versiyon olması kodlarımızı etkilemez. Fakat güncel versiyonu kullanmaya dikkat etmeliyiz. 

## Android Jetpack

> Geliştiricilerin en güzel ve en verimli uygulamaları yazabilmeleri için oluşturulmuş kütüphaneler bütünüdür.

> NOT: Kütüphane eklemelerini build.gradle(module or app) içindeki dependencies bölümüne yaparız:

![image](https://user-images.githubusercontent.com/109730490/183259930-6b5c48aa-97ad-4d83-bf81-7a9648ef258d.png)

> NOT: Eğer bir şey güncel değilse sarı ile işaretlenir (üzerine geldiğimizde olması gereken güncel versiyonuda söyler):

![image](https://user-images.githubusercontent.com/109730490/183260001-807bfb97-b2cc-4dff-9cef-182e18fd659e.png)

> Değiştirmememiz bir problem yaratmaz. Fakat eski versiyonları kullanırsak eklediğimiz kütüphaneler kendi aralarında sorun yaşayabilir. 

## Navigation Kullanmak İçin Yaptıklarımız:

> build.gradle'da dependencies kısmına eklediklerimiz:

![image](https://user-images.githubusercontent.com/109730490/183260235-42c5f5c0-3ba3-4c6c-9f6d-01c0d3b66466.png)

> Fragment'lar arası veri aktarmak için gerekli olan kütüphaneleri eklemek için yapılanlar:

- önce build.gradle project'in içine bunları ekliyoruz:

![image](https://user-images.githubusercontent.com/109730490/183260788-bfd83497-5fe9-48dc-9fb1-081f4c4993f8.png)

> Dikkat: Yukarıda def yazan yerde aslında developer.android.com'da val yazıyor ancak bu şekilde sync now yapmaya çalıştığımızda "val class'ı çözümlenemedi" hatası alıyorum. Derste ki gibi def'e çevirince çalıştı. 

- sonra build.gradle module içine bunları ekliyoruz:

![image](https://user-images.githubusercontent.com/109730490/183260575-b82826f0-04ed-4e7a-be0d-c8c40efdb7ef.png)

> Bu işlemleri sırayla yapmalıyız yoksa build.gradle module'de hata alırız. 

> build.gradle project'in içerisine eklediğimiz şeyler bir eklenti olarak build.gradle module'ün içine eklenir (apply plugin olarak).

> Eklemeler düzgün yapıldı mı diye test etmek için MainActivity içind ebu şekilde Navigation çıkıyor mu diye bakabiliriz:

![image](https://user-images.githubusercontent.com/109730490/183260691-3d31c0c3-e780-4240-893c-20f865a4fe7d.png)

> Sonrasında deneme amaçlı emülatörü çalıştırıp hata veriyor mu diye bakmalıyız hata alırsak eklemeler sırasında bir yerde hata yapmışız demektir.

## Navigation'ı Projeye Ekledikten Sonra

> Navigation'ı kullanabilmek için öncelikle navige edecek ekranlarımız olmalı. Bu yüzden projeye iki tane fragment ekledik sonra bu fragment'lar arasında geçiş ve veri aktarımı nasıl yağılır bunun üzerine çalıştık.








