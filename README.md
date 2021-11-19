# block31exercise

## Uppgifter
* Färdigställ implementationen av klassen Tuple. Tanken är att den ska fungera som en tupel i e.g. Haskell eller Python. Den ska hålla två värden av (potentiellt) olika (godtycklig) typ, och ha metoderna fst() och snd() för att returnera första respektive andra komponenten.
* Titta på koden för AnimalShelter med tillhörande kring-klasser. Kika särskilt på ShelterError. Hur kan vi tänka om, så att det inte är möjligt att sätta hundar i ett katt-hem, och vice versa, utan att förlora code reuse eller extensibility? Vi vill få ett statiskt felmeddelande, inte ett fel (exception) vid runtime!
