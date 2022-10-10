# Mobilne_Quiz_2

Działąnie Aplikacji
https://user-images.githubusercontent.com/57639228/194901822-b91928f7-42a1-4474-868f-34e547c33e62.mp4

Logi
Proces działąnia aplikacji bez obracania
---------------------------- PROCESS STARTED (5757) for package com.example.quiz ----------------------------
2022-10-10 12:41:06.380  5757-5757  MainActivity            com.example.quiz                     D  got into create
2022-10-10 12:41:06.522  5757-5757  MainActivity            com.example.quiz                     D  got into start
2022-10-10 12:41:06.523  5757-5757  MainActivity            com.example.quiz                     D  got into resume
2022-10-10 12:41:27.263  5757-5757  MainActivity            com.example.quiz                     D  got into pause
2022-10-10 12:41:27.266  5757-5757  MainActivity            com.example.quiz                     D  got into stop
2022-10-10 12:41:32.170  5757-5757  MainActivity            com.example.quiz                     D  got into start
2022-10-10 12:41:32.171  5757-5757  MainActivity            com.example.quiz                     D  got into resume
2022-10-10 12:41:36.566  5757-5757  MainActivity            com.example.quiz                     D  got into pause
2022-10-10 12:41:36.570  5757-5757  MainActivity            com.example.quiz                     D  got into stop
2022-10-10 12:41:43.583  5757-5757  MainActivity            com.example.quiz                     D  got into destroy
---------------------------- PROCESS ENDED (5757) for package com.example.quiz ----------------------------

Proces działąnia aplikacji z obracaniem
Prz obruceniu aplikacja zatrzymuje i niszczy aplikacje po czym obraca ekran i na nowo tworzy
Przy pierwszej analizie obrót powodował powrót do pierwszego pytania
---------------------------- PROCESS STARTED (4467) for package com.example.quiz ----------------------------
2022-10-10 12:46:43.471  4467-4467  MainActivity            com.example.quiz                     D  got into create
2022-10-10 12:46:43.615  4467-4467  MainActivity            com.example.quiz                     D  got into start
2022-10-10 12:46:43.617  4467-4467  MainActivity            com.example.quiz                     D  got into resume
2022-10-10 12:46:54.558  4467-4467  MainActivity            com.example.quiz                     D  got into pause
2022-10-10 12:46:54.565  4467-4467  MainActivity            com.example.quiz                     D  got into stop
2022-10-10 12:46:54.576  4467-4467  MainActivity            com.example.quiz                     D  got into destroy
2022-10-10 12:46:54.627  4467-4467  MainActivity            com.example.quiz                     D  got into create
2022-10-10 12:46:54.662  4467-4467  MainActivity            com.example.quiz                     D  got into start
2022-10-10 12:46:54.664  4467-4467  MainActivity            com.example.quiz                     D  got into resume

Przy drugiej analizie obrót powodował powrót do aktualnego pytania
---------------------------- PROCESS STARTED (7487) for package com.example.quiz ----------------------------
2022-10-10 13:55:43.867  7487-7487  MainActivity            com.example.quiz                     D  got into create
2022-10-10 13:55:43.962  7487-7487  MainActivity            com.example.quiz                     D  got into start
2022-10-10 13:55:43.965  7487-7487  MainActivity            com.example.quiz                     D  got into resume
2022-10-10 13:55:51.952  7487-7487  MainActivity            com.example.quiz                     D  got into pause
2022-10-10 13:55:51.955  7487-7487  MainActivity            com.example.quiz                     D  got into stop
2022-10-10 13:55:51.957  7487-7487  MainActivity            com.example.quiz                     D  got into destroy
2022-10-10 13:55:52.003  7487-7487  MainActivity            com.example.quiz                     D  got into create
2022-10-10 13:55:52.064  7487-7487  MainActivity            com.example.quiz                     D  got into start
2022-10-10 13:55:52.065  7487-7487  MainActivity            com.example.quiz                     D  got into resume
