Library Management System API
Bu proje, kütüphane yönetim sistemi için bir REST API sağlar. CRUD işlemleri yapabilen çeşitli endpointler sunar.

Endpointler
Author Endpoints
HTTP Method	URL	Açıklama
POST	/v1/authors	Yeni bir yazar ekler
GET	/v1/authors/{id}	Belirtilen id ile yazarı getirir
PUT	/v1/authors	Mevcut bir yazarı günceller
DELETE	/v1/authors/{id}	Belirtilen id ile yazarı siler
Book Endpoints
HTTP Method	URL	Açıklama
POST	/v1/books	Yeni bir kitap ekler
GET	/v1/books/{id}	Belirtilen id ile kitabı getirir
PUT	/v1/books	Mevcut bir kitabı günceller
DELETE	/v1/books/{id}	Belirtilen id ile kitabı siler
Category Endpoints
HTTP Method	URL	Açıklama
POST	/v1/categories	Yeni bir kategori ekler
GET	/v1/categories/{id}	Belirtilen id ile kategoriyi getirir
PUT	/v1/categories	Mevcut bir kategoriyi günceller
DELETE	/v1/categories/{id}	Belirtilen id ile kategoriyi siler (Kitap varsa silinmez)
Publisher Endpoints
HTTP Method	URL	Açıklama
POST	/v1/publishers	Yeni bir yayınevi ekler
GET	/v1/publishers/{id}	Belirtilen id ile yayınevini getirir
PUT	/v1/publishers	Mevcut bir yayınevini günceller
DELETE	/v1/publishers/{id}	Belirtilen id ile yayınevini siler
Book Borrowing Endpoints
HTTP Method	URL	Açıklama
POST	/v1/bookborrowings	Yeni bir kitap ödünç alma kaydı ekler
GET	/v1/bookborrowings/{id}	Belirtilen id ile ödünç alma kaydını getirir
PUT	/v1/bookborrowings	Mevcut bir ödünç alma kaydını günceller
DELETE	/v1/bookborrowings/{id}	Belirtilen id ile ödünç alma kaydını siler
Kurulum ve Çalıştırma
Bu projeyi klonlayın:

git clone https://github.com/your-username/LibraryManagementSystem.git
Proje dizinine gidin:

cd LibraryManagementSystem
Gerekli bağımlılıkları yükleyin ve projeyi çalıştırın:

mvn clean install
mvn spring-boot:run
4.Sql'deki database 'imin backup'ını alıp repoya ekledim.Ekledim .sql formatındaki dosyayı sql'de restore edip database'imi kendi localinize kopyalıyabilirsiniz.

API'yi Postman veya başka bir araçla kullanabilirsiniz.Postmande hazır kullandığım end pointleri export edip repoya ekledim o dosyayı postmana import ederek end pointleri ve hazır JSON formatındaki put ve post kodlarına erişebilirsiniz.
Bağımlılıklar
Spring Boot
Spring Data JPA
Lombok
ModelMapper
PostgreSQL # Week12-LibraryManagementSystem  # Week12-LibraryManagementSystem  
