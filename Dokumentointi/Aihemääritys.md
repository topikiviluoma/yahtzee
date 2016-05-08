**Aihe:** Aiheena on perinteinen Yahtzee noppapeli, joka aluksi rajoittuu vain kahteen pelaajaan. Ideana on heittää vuorotellen viittä noppaa ja kerätä erinäköisiä käsiä. Pelaaja heittää vuorollaan yhteensä kolme kertaa. Tässä vaiheessa ei toteuteta minkäänlaista tekoälytoimintoa.

**Käyttäjät:** Käyttäjinä toimivat ihmispelaajat

**Käyttäjien toiminnot:**

 - Käyttäjien ei tarvitse erikseen kirjautua järjestelmään
 - Käyttäjät vuorotellen painavat 'Roll' painiketta, jolloin joko kaikki nopat tai valinnan ulkopuolle jääneet nopat heitetään.
 - Käyttäjät lopuksi valitsevat, minkä käden käyttävät heittämillään nopilla

**Luokkakaavio:**

![Alt text](/Dokumentointi/luokkakaavio.png)

**Sekvenssikaavtiot:**

![Alt text](/Dokumentointi/lukitseminen_ja_heittaminen.png)

**Käyttöohjeet:**
Sovellusta ohjataan komentoriviltä. Käynnistäessä ohjelma tulostaa noppien silmäluvut ja pyytää lukitsemaan haluamansa nopat. Nopat ovat indeksimäisesti 0,1,2,3,4 ja näitä lukuja käytetään syötteenä. Syötetään lukittavat nopat putkeen komentoriville, jonka jälkeen vahvistetaan painamalla Enteriä. Tämä toistetaan kaksi kertaa, jonka jälkeen ohjelma kysyy mihin käteen haluaa pisteet syöttää. Käsi tulee syöttää täsmälleen oikein, isoilla kirjaimilla, jotta ohjelma tunnistaa sen, muuten sen joutuu syöttämään uudelleen. Vahvistetaan Enterillä. Tätä jatketaan pelin loppuun saakka.

