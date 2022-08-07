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


> Data Binding dediğimiz başka bir android jetpack kütüphanesini kullanırken <layout> <layout/> tagları kullanıyoruz:

![image](https://user-images.githubusercontent.com/109730490/183288952-74d4f821-798b-4546-950b-6c12ccf0dd6b.png)

> Hatta data binding'İ kullanıyorsak bunu eklemek zorundayız. Ama şu anda bu projede kullanmadık. 

> Linear layout'ta textView'u ortalamak:

> Vertical ve center dediğimiz için 1 numaralı alanda konumlandırdı ama horizontal ve center deseydik 2 numaralı alanda konumlandıracaktı. Yani orientation default olarak horizontal düşünülüyor:

![image](https://user-images.githubusercontent.com/109730490/183289163-4eacb5e6-5a80-41e5-a4be-c3ed0e5434e6.png)

## Bir Navigation Grafiği Oluşturmak

> Önce res klasörünün altında bir navigasyon grafiği oluşturacağız. res kalsörüne sağ tık yapıp aşağıdaki işlemi yapalım:

![image](https://user-images.githubusercontent.com/109730490/183289666-a73001dd-40fb-476d-a8ac-969d0ce316ac.png)

> Bir projenin içinde birden fazla navigasyon grafiği oluşturulabilir. 

> Devamında şunlara dikkat etmeliyiz:

![image](https://user-images.githubusercontent.com/109730490/183289792-91887863-881f-49cc-a8d0-46b0bed08e61.png)

- 1 numaralı alan da isimlendirme yaparken dikkat etmeliyiz. Bu da bir XML kaynağı olduğu için isimde büyük harf, türkçe karakter, özel karakter olmamalı kelime aralarında alt tire kullanabiliriz.

- 2 numaralı alanda resıurce type'ı Navigation olarak değiştirmeliyiz.

- 3 numaralı alanda directory name'i istediğimiz gibi seçemeyiz "navigation" olmak zorunda.

> Sonrasında oluşturulan ekranda project butonundan proje dosyalarının göründüğü alanı kapatıp daha rahat bir alan elde edebiliriz. 

> Dosyanın için böyle görünüyor olacak:

![image](https://user-images.githubusercontent.com/109730490/183290056-4803a55f-49be-4cc0-ab46-c03480049204.png)

> Bu ekrana istediğimiz kadar farklı öge koyabiliriz. 

> Bir öge eklemek için kırmızı ile işaretli butona basmalıyız.

> Bastığımızda proje içinde eklediğimiz fragment ve activity'ler burada görünüyor:

![image](https://user-images.githubusercontent.com/109730490/183290159-afe14fb5-eadf-4ef5-89da-0f9bb7aaf3d6.png)

> Bu ekrana eklediğimizde fragment'ların tasarımı dahi görünüyor fakat bazen üstlerinde no preview avaible yazabilir. Fakat bu bir problem yaratmaz. 

> Bir ev simgesi var. Bu hangi ögenin ilk gösterileceğini gösteriyor. İstediğimizde yukarıdaki ev butonuna basarak hangi ögenin ilk gösterileceğini değiştirebiliyoruz. Bunu yapmak için ilk gösterilmesini istediğimiz ögenin üstüne basıp ev butonuna basıyoruz. 

> Ögelerden herhangi birine tıkladığımızda sağ tarafta özellikleri çıkıyor.

> Dikkat edelim bu da aslında bir XML dosyası. 

> Herhangi bir ögenin üstüne tıkladığımızda sağ tarafında mavi bir top çıkıyor:

![image](https://user-images.githubusercontent.com/109730490/183290535-f4ec9428-de0d-4007-8867-3f1a8585667c.png)

> Bu toptan constraint layout'ta olduğu gibi bir ok çıkıyor. Bu oku herhangi bir ögeye sabitleyebiliyoruz ve iki öge arasında bir aksiyon oluşturuluyor. Bu aksiyon hangi destination'dan hangi destination'a gidileceğini belirten bir (ok) yol. Destination: hedef

> Aksiyon'un üzerine tıklayabiliyoruz ve özelliklerini yan tarafta görebiliyoruz: 

> Her aksiyonun (action) kendisine ait bir id'si var.

![image](https://user-images.githubusercontent.com/109730490/183291481-6da0c2aa-8573-479f-94ab-328cdc074294.png)

![image](https://user-images.githubusercontent.com/109730490/183291523-04f0ed73-02cb-4fc7-bad9-1d43b3e680bb.png)

> Eğer oku yanlış yöne koyduysak bu özellikler bölümünde destionation'dan değiştirebiliyoruz. 

> Ayrıca animations bölümünden otomatik olarak giriş çıkış animasyonları ekleyebiliyoruz. 

> Eğer fragment2'den fragment1'e döneceksek şöyle yapabiliriz:

![image](https://user-images.githubusercontent.com/109730490/183291625-5366d34c-f36e-4262-ad5b-7442425292f1.png)

> Bu şekilde yaptığımızda iki fragment arasında bir döngü olur ve istediğimiz zaman birinden diğerine geçiş yapabiliriz. 

> Activity'ye öncesinde frame layout ekleyip fragment'ları onun içinde göstermiştik ancak bu kez NavHostFragment ekleyeceğiz. Bunu sürükleyip ekrana bıraktığımızda bizden bir Navigation grafiği seçmemizi isteyecek. HAzırladığımız grafiği burada kullanacağız.

![image](https://user-images.githubusercontent.com/109730490/183291958-e309b587-0f53-4ba0-b889-7d9058d2e273.png)

> Hazırladığımız grafiği seçtikten ve onayladıktan sonra artık activity'mizin içinde ilk gösterilecek olan fragment gösteriliyor:

![image](https://user-images.githubusercontent.com/109730490/183292046-a431f6a2-bd4c-492e-a23b-c0d08e9eb562.png)

> Navigation graph'ta yaptığımız her işlem arka planda yeni sınıflar oluşturulmasını tetikliyor. 

> Navigation üzerinde butonlar için onClick metodunu kullanmaktansa butonların id'leri ile işlem yapmak daha kolay. 

> Class'lardan herhangi biri çıkmazsa ya da bir hata alırsak build > rebuild yapmalıyız. 

> Sonrada invalid caches and restart yapabiliriz:

![image](https://user-images.githubusercontent.com/109730490/183293676-35fe2ceb-4024-45f9-9e11-5aca43768ab5.png)

## Navigation'da Fragmentlar Arası Veri Aktarma

> Veri aktarmak için veri aktaracağımız fragment'da bir argüman (argument) oluşturmamız gerekiyor. Bunun için çizdiğimiz navigation graph'a gidiyoruz. İkinci fragment'ın üstine tıkladıktan sonra sağ menüde arguments bölümündeki + butonuna tıklıyoruz. Sonra karşımıza şu ekran geliyor:

![image](https://user-images.githubusercontent.com/109730490/183294316-f49b4f83-84c4-4d97-9c4b-529dd050dac4.png)

> Burada önce name yani argument'ımızın ismini giriyoruz bunu değişken ismi olarak düşünebiliriz. 

> Artık eklendi:

![image](https://user-images.githubusercontent.com/109730490/183296106-7f5d2f3f-09b4-449a-9407-c5777d5befc2.png)

> Artık 2. fragment'a giden action'lar içerisinde bu değişkene ulaşabiliyor olmam gerekir. 

> Bunu yaptıktan sonra rebuild project yapalım. Kendisi otomatik olarak gerekli sınıfları oluşturuyor ama ne olur ne olmaz diye bunu yapıyoruz. 

> String olduğu için tırnak işareti eklememize gerek yokmuş:

![image](https://user-images.githubusercontent.com/109730490/183296385-1a4b17dd-b9da-41ea-8dd3-279f27169b52.png)

> Navigation; fragment'lar arası geçişi ve veri aktarımını oldukça kolaylaştıran bir framework. Detaylarını ileri seviye kursta öğreneceğiz. 

## Projenin Ekran Görüntüleri

- Uygulama Açıldığında

![image](https://user-images.githubusercontent.com/109730490/183296991-13b6ad85-11cd-4e16-b38c-5d48df296855.png)

- NEXT butonuna basıldığında

![image](https://user-images.githubusercontent.com/109730490/183297039-a71aa62c-7d88-40ca-942e-88b9d798fb4d.png)

- BACK butonuna basıldığında

![image](https://user-images.githubusercontent.com/109730490/183297058-71eecaef-c8d7-4edb-bd24-3feb712835d3.png)

- Navigation Çizimi

![image](https://user-images.githubusercontent.com/109730490/183297079-8369f977-e885-4eb5-82cc-f873df82050d.png)


## Kaynaklar

- [BTK Akademi](https://www.btkakademi.gov.tr/portal/course/kotlin-ile-android-mobil-uygulama-gelistirme-egitimi-temel-seviye-10274)
