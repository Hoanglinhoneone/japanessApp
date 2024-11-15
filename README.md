Tên app: japaness 
(Quy định đặt tên không được chứa ký tự đặc biệt, dưới 30 ký tự, không đặt trùng tên app khác trên store (facebook, google…), k đặt thêm số phiên bản, không chứa từ khóa , nên đặt dễ đọc dễ nhớ )

# Mô hình : (Đọc lại tài liệu về MVP - MVVM - Boilerpalet) 
 Trong android đổi MVC => MVP / MVVM 
Với MVP : Giao tiếp Model  <<==>> View qua Presenter bằng Interface (Do MVP qua phức tạp khi chỉ có thể kết nối 1 - 1 PresenterInterface - 1 view => phức tạp về code vì phải gắn cặp 1 - 1) 
⇒ xu hướng MVVM giải quyết được tình trạng đó với Observer Design patern (Live Data). Khi đó dữ liệu từ ViewModel có thể cập nhật lên n View cùng 1 lúc.
Với MVVM : Giao tiếp Model  <=⇒ View qua ViewModel .
Với cách code Boilerplate => Đơn giản , app đơn giản chưa cần build chuẩn MVVM hay MVP. Dễ gặp tình trạng dư thừa code, k ưu tiên dùng
- Link project for boilerpalet : https://github.com/GrossumUA/TAS_Android_Boilerplate
MVP và MVVM yêu dùng cho những app phức tạp, đa màn.

	⇒ Ưu tiên dùng MVVM.

# Load audio media : 
Dùng mediaPlayer hoặc exopPlayer . ưu tiên dùng exoplayer hơn vì tối ưu hơn
(gặp tình trạng khi phát play audio sẽ bị delay do mạng => Cần tìm hướng khắc phục khi build)
Tạo 1 class play audio để có thể tái sử dụng ở các nơi khác nhau
# Draw   chữ tiếng nhật:
Dùng thư viện / module  dmak tận dụng sẵn data từ kanjivg để run trong project
Tạo 1 class draw riêng để có thể tái sử dụng 
# SDK :
phân biệt các phiên bản sdk:

 sdkCompile: 35, minSdk: 24, targetSdk: 35 
Logger : Timber => k cần tag, tự xác định class đặt debug, hiện thông tin dòng code đặt debug.
Room :SQLIte : Đã convert data từ mysql sang SQLite

# Convention : 
Class: HomeActitivy.kt, AlphabetActivity.kt, VocabularyFragment.kt…
(Hậu tố Activity, Fragment, Adapter, ViewModel,...)=> PascalCase
File xml: activity_login.xml, fragment_home.xml…
Thành phần trong xml: button -> btn_login, TextView -> tv_username…
res/values : color_blule, string_app_name,...
res/drawable: ic_user, bg_home_screen….
Biến java/kotlin : userName, userEmail… => camelCase
# Folder  project : 
Tìm hiểu tổng quan các file có trong 1 project android

.gradle : Chứa các file liên quan đến Gradle dự án, là công cụ build cho dư án android. Gradle quản lí các thư viện dependencies được thêm vào dự án.
.idea :  Chứa các thiết lập của Inteleji IDEA (Bản chất android studio được xây dựng dựa trên Inteleji) => lưu thông tin cấu hình của project và môi trường .
app:  là thư mục chính chứa mã nguồn của dự án, chứa file java/kotlin,xml, tài nguyên ảnh/text/file cấu hình. => chứa mã nguồn logic dự án
Gradle: Chứa các file gradle Wrapper, dùng để hỗ trợ việc build dự án. Gradle Wrapper giúp đảm bảo mọi người cùng sử dụng một phiên bản Gradle khi phát triển ứng dụng
Build.gradle.kts : Là file cấu hình build chính của dự án. Chứa phiên bản gradle, repositories,  dependencies chung cho dự án
Gradlew và gradlew.bat : chứa các script để chạy Gradle wrapper.  Cho phép chạy Gradle mà k cần cài trên máy.
Local.properties: Chứa cấu hình cục bộ của dự án, (Vd: đường dẫn sdk của Android tren máy tính => tùy thuộc vào mỗi máy, k đồng nhất)
Settings.gradle.kts : chứa danh sách các module của dự án (dự án đơn giản thì chỉ có module app)
External Libraries: Chứa các thư viện và dependencies của dự án, các thư viện android, java or dependencies khác được định nghĩa trong build.gradle
Scratches and Consoles : Chứa các file nháp và giao diện console, dùng để test mã or ghi chú.
Cấu trúc folder src : trong project
![image](https://github.com/user-attachments/assets/c41a9614-3b3d-4b79-827b-e7a20b0bd299)



