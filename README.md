# Interpreterfordprog
Interpreter implementálása és dokumentálása
## Feladat:
Aritmetikai kifejezéseket feldolgozó nyelv Követelmények:

- Típusok: aritmetikai kifejezés, szám, lista (tartalmazhat számokat is és kifejezéseket is).
- Műveletek: 
  - A szokásos aritmetikai operátorok: +, −, /, ∗, hatvány, (, ).
  - Helyettesítés:Pl.:a=expr((x+3)∗4∗y+x)és b=expr((z+2)+1)esetén a.substitute(x=b) eredménye (((z + 2) + 1) + 3) ∗ 4 ∗ y + ((z + 2) + 1)
  - Zárójelmentesítés: A kifejezés átalakítása olyan alakra, amelyben nincs szükség zárójelekre. Pl. 3 ∗ (4 + 5) → 3 ∗ 4 + 3 ∗ 5.
  - Egyszerűsítés: Alkalmazzunk egyszerísítési szabályokat.
  - Kiértékelés: Kiértékeli az aritmetikai kifejezést (a változók értékeit parameterekként kell megadni).
  - A listák elemeit egész számokkal indexeljük, a lista hossza lekérdezhető legyen, továbbá a push back és pop back műveletekkel bővíthetjük a listát, ill. csökkenthetjük az elemszámát.
- Két egyváltozós (ugyanazon változót tartalmazó) kifejezés esetén egyenletmegoldás, lépésről-lépésre. • Differenciálás, integrálás.
- A for (szám változó, kezdő és utolsó érték) eszköz.
- Változók/kifejezések értékeinek beolvasása/kiírása a standard inputról/outputra.
- Változók és blokkok (hatáskörkezelés). • Saját függvények és eljárások.
