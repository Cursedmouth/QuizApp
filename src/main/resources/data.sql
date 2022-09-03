-- Kategoria 1

insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          1,
          'Rodzinna planeta Darth Vadera:',
          'category1',
          'Tatooine',
          'Naboo',
          'Coruscant',
          'Korriban',
          1,
          -1)
;
insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          2,
          'Kto był pierwszym uczniem Dartha Sidiousa:',
          'category1',
          'Darth Vader',
          'Darth Maul',
          'Hrabia Dooku',
          'Jar Jar Binks',
          2,
          -1)
;
insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          3,
          'Chewbacca najlepszy przyjaciel Hana Solo był przedstawicielem rasy:',
          'category1',
          'Ewoków',
          'Huttów',
          'Wookiee',
          'Jawów',
          3,
          -1)
;
insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          4,
          'Pierwsze zdanie Kodeksu Jedi to:',
          'category1',
          'Spokój to kłamstwo - jest tylko pasja.',
          'Nie ma śmierci - jest spokój.',
          'Nie ma pasji - jest spokój.',
          'Nie ma emocji - jest spokój.',
          4,
          -1)
;
insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          5,
          'Pierwsze zdanie Kodeksu Sithów to:',
          'category1',
          'Spokój to kłamstwo - jest tylko pasja.',
          'Dzięki pasji osiągam siłę.',
          'Dzięki sile osiągam potęgę.',
          'Moc mnie uwolni.',
          1,
          -1)
;
insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          6,
          'Z ręki Darth Maula w bitwie w Theed zginał:',
          'category1',
          'Obi-Wan Kenobi',
          'Qui-Gon Jinn',
          'Mace Windu',
          'Kit Fisto',
          2,
          -1)
;


-- Kategoria 2


insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          11,
          'Massive Attack to zespół muzyczny grający muzykę w gatunku:',
          'category2',
          'Trip Hop',
          'Techno',
          'Disco Polo',
          'K-Pop',
          1,
          -1)
;
insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          12,
          'Portishead to brytyjski zespół muzyczny utworzony w roku:',
          'category2',
          '1981',
          '1991',
          '2001',
          '2011',
          2,
          -1)
;
insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          13,
          'Pierwszy studyjny album U2 wydany w 1980 roku nazywał się:',
          'category2',
          'Achtung Baby',
          'All That You Cant Leave Behind',
          'Boy',
          'Songs of Experience',
          3,
          -1)
;
insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          14,
          'Pierwszy singiel zespołu Gorillaz z 2001r to:',
          'category2',
          'PAC-MAN',
          'Stylo',
          'Feel Good Inc.',
          'Clint Eastwood',
          4,
          -1)
;
insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          15,
          'Wykonawca Marszu Imperialnego ze ścieszki dzwiękowej do filmu Gwiezdne Wojny: Imperium Kontratakuje to:',
          'category2',
          'John Williams',
          'Hans Zimmer',
          'Wojciech Kilar',
          'John Powell',
          1,
          -1)
;
insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          16,
          'Ścieszkę dzwiękową do filmu Kiler wykonał zespół:',
          'category2',
          'Perfect',
          'Elektryczne Gitary',
          'Bajm',
          'Kult',
          2,
          -1)
;

-- Kategoria 3


insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          21,
          'Pytanie testowe1:',
          'category3',
          'Yes',
          'Nope',
          'Nope',
          'Nope',
          1,
          -1)
;
insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          22,
          'Pytanie testowe2:',
          'category3',
          'Nope',
          'Yes',
          'Nope',
          'Nope',
          2,
          -1)
;
insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          23,
          'Pytanie testowe3:',
          'category3',
          'Nope',
          'Nope',
          'Yes',
          'Nope',
          3,
          -1)
;
insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          24,
          'Pytanie testowe4:',
          'category3',
          'Nope',
          'Nope',
          'Nope',
          'Yes',
          4,
          -1)
;
insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          25,
          'Pytanie testowe5:',
          'category3',
          'Yes',
          'Nope',
          'Nope',
          'Nope',
          1,
          -1)
;
insert into questions(questionId, questionText, category, optionA, optionB, optionC, optionD, answer, chose)
values(
          26,
          'Pytanie testowe6:',
          'category3',
          'Nope',
          'Yes',
          'Nope',
          'Nope',
          2,
          -1)
;

-- Kategorie

INSERT INTO categories (categoryid, categoryname)
VALUES (1, 'Kategoria 1'),
       (2, 'Kategoria 2'),
       (3, 'Kategoria 3');


-- Pytania Kategorii
INSERT INTO question_category (questionid, categoryid)
VALUES (1, 1),
       (2, 1),
       (3, 1),
       (4, 1),
       (5, 1),
       (6, 1),
       (11, 2),
       (12, 2),
       (13, 2),
       (14, 2),
       (15, 2),
       (16, 2),
       (21, 3),
       (22, 3),
       (23, 3),
       (24, 3),
       (25, 3),
       (26, 3);



-- Komendy

-- SELECT

select * from questions;
select * from questions WHERE category='category1';
select * from questions WHERE category='category2';
select * from questions WHERE category='category3';
select * from categories;
select * from question_category;
select * from scores;

-- DELETE

DELETE from questions WHERE category='category1';
DELETE from questions WHERE category='category2';
DELETE from questions WHERE category='category3';
DELETE from categories;
DELETE from question_category WHERE categoryid='1';
DELETE from question_category WHERE categoryid='2';
DELETE from question_category WHERE categoryid='3';
DELETE from scores;

