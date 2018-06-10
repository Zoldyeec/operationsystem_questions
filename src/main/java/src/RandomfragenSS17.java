package src;

import java.util.Scanner;
import org.junit.Test;

public class RandomfragenSS17 {

	static Scanner scanner = new Scanner(System.in);
	/**
	 * question test method
	 */
	@Test
	public void testApp() {

		System.out.println("════════════════════════════════════════════════════════════════════════");
		System.out.println("Drücke Enter, um Fragen von Betriebssysteme (insg. 20) zu starten.");
		System.out.println("════════════════════════════════════════════════════════════════════════");
		System.out.println("50% kommen in der Klausur vor.");
		System.out.println("Bei 'stop' beendest du das Programm.");

		
		test();
	}

	public void test() {
		
		System.out.println("");
		System.out.println("-- press enter for new question --");

		String option = null;
		option = scanner.nextLine();

		do {
			if (option.matches("")) {

				double random = Math.random();
				if (random < 0.05){
					System.out.println("1pt os-list: Nenne 3 Betriebssysteme verschiedener Hersteller die gerade im Einsatz sind.");
					scanner.nextLine();
					System.out.println("Windows 10");
					System.out.println("Mac OS X");
					System.out.println("Linux");
					this.test();

				} else if (random > 0.10 && random <= 0.15) {
					System.out.println("3pt kernel-user-space: Nenne jeweils die Folgen eines Programmfehlers im Kernel-Space *und* im User-Space\nund wieso ein Fehler das restliche System beeinträchtigt.\nErläutere, warum ein Fehler im Kernel-Space andere Folgen hat.");
					scanner.nextLine();
					System.out.println("A: Programmierfehler im Kernel-Space: Betriebssystem / gesamter Rechner stürzt ab, im besten Fall Bluescreen (-> denn dieser liegt in der Ebene unter dem User-Space.\nBaut eine Komponente Mist, stürzt das gesamte Betriebssystem ab.)" + System.lineSeparator()
					+ "Programmierfehler im User-Space: Programm stürzt ab, andere Programme laufen weiter bzw. das restliche System wird nicht beeinträchtigt.");
					scanner.nextLine();
					System.out.println("Im Kernel-Space sind alle Programme im selben Adressraum.");
					this.test();

				} else if (random > 0.15 && random <= 0.20) {
					System.out.println("5pt cpu-gpu-diff: Begründe, warum es einen GPU und CPU gibt und nicht ein Bauteil, das beides gut kann.\nBegründe den Unterschied anhand eines Beispiels.");
					scanner.nextLine();
					System.out.println("A: CPU: rechnet hintereinander, oft chaotisch, eine Anweisung baut auf Ergebnisse der vorherigen Anweisung auf.");
					System.out.println("GPU: rechnet viele Dinge gleichzeitig, gut für Bildverarbeitung, da jeder Pixel/Drahtgitterpunkt unabhängig voneinander berechnet werden kann.");
					System.out.println("Beide besitzen unterschiedliche Aufgaben, denn jede Hardware ist auf ihre Aufgaben optimiert.");
					this.test();

				} else if (random > 0.20 && random <= 0.25) {
					System.out.println("5pt pipelining: Erläutere, welcher Zusammenhang zwischen dem Controllflow eines Programms und Pipelining eines CPUs bestehen.\nNenne eine Kontrollstruktur, die sich negativ auf Pipelining auswirken kann und erläutere kurz warum.");
					scanner.nextLine();
					System.out.println("A: Der Controlflow eines Programms kann verändern, welche Anweisung als nächstes ausgeführt wird.");
					scanner.nextLine();
					System.out.println("Pipelining: die CPU verarbeitet nächste Befehle/Anweisungen im Voraus, um einzelne Bausteine der CPU voll auszulasten.");
					scanner.nextLine();
					System.out.println("In diesem Fall sind die falschen Befehle in der Pipeline und diese muss leer geräumt werden." + System.lineSeparator()
					+ "Danach fängt der CPU an die Pipeline wieder mit den richtigen Befehlen zu füllen." + System.lineSeparator()
					+ "'Pipeline Stall' schadet Performance: CPU kann mit einer leeren Pipeline in derselben Zeit weniger abarbeiten." + System.lineSeparator()
					+ "Erst wenn die Pipeline wieder gefüllt ist, kann die CPU wieder mit voller Effizienz arbeiten.");
					scanner.nextLine();
					System.out.println("Beispiel einer Kontrollstruktur: IF-Verzweigung" + System.lineSeparator()
					+ "CPU hat die nächsten Anweisungen für den true-Zweig in der Pipeline. Die Bedingung ergibt aber false." + System.lineSeparator()
					+ "Daher sind die falschen Anweisungen in der Pipeline. → Pipeline muss leer geräumt werden und neu mit den Anweisungen des false-Zweigs gefüllt werden.");
					this.test();

				} else if (random > 0.25 && random <= 0.30) {
					System.out.println("1pt stack: Nenne den Namen des Speicherbereichs, in dem lokale Variablen gespeichert werden.");
					scanner.nextLine();
					System.out.println("A: Der Stack.");
					this.test();

				} else if (random > 0.30 && random <= 0.35) {
					System.out.println("3pt man: Nenne eine gute Quelle für Informationen zu einer C-Funktion (z.B. 'malloc()').\nErläutere kurz 3 Vorteile dieser Quelle gegenüber einer einfachen Suche im Internet (z.B. Über Google).");
					scanner.nextLine();
					System.out.println("A: man pages");
					scanner.nextLine();
					System.out.println("Vorteile:");
					System.out.println("- Infos zur aktuell installierten Version, nicht einer zufälligen Version");
					System.out.println("- alle relevanten Infos zur Verwendung, nicht nur unter User gängige Anwendungsfälle");
					System.out.println("- beinhalten Errorcodes, um zu sehen, was sie bedeuten, so kann man auf den Fehler des eigenen Prorgamms reagieren.");
					System.lineSeparator();
					System.out.println("- enthalten oft kurze und getestete Beispiele");
					System.out.println("- werden gepflegt und überarbeitet");
					System.out.println("- sind relativ kurz und enthalten dennoch sehr viele Informationen");
					this.test();

				} else if (random > 0.35 && random <= 0.40) {
					System.out.println("3pt null-term-in-str: Nenne den Text der von 'printf()' ausgegeben wird.\nErläutere kurz wie dieses Verhalten das restliche Programm beeinflusst und warum dies ein Sicherheitsproblem darstellen kann." + System.lineSeparator()
					+ "~~~" + System.lineSeparator()
					+ "char foo[ ] = 'hallo /0 welt'; (Strich muss andersrum sein, kann aber nicht dargestellt werden in Java)" + System.lineSeparator()
					+ "printf('%s', foo);" + System.lineSeparator()
					+ "~~~");
					scanner.nextLine();
					System.out.println("A: Ausgabe: hallo");
					scanner.nextLine();
					System.out.println("Restliches Programm tut so, als ob im String nach \0 nichts existiert, um Speicherplatz zu sparen (printf gibt es nicht aus)."+ System.lineSeparator()
					+ "Ein Angreifer kann Daten (z.B. Schadcode) in das Programm einschleusen, die er später mit einem anderen Angriff ausführen kann.");
					this.test();

				} else if (random > 0.40 && random <= 0.45) {
					System.out.println("3pt bin-vs-proc: Erläutere kurz was ein Executable (EXE-Datei unter Windows) und ein Prozess repräsentieren.\nWer kann aktiv etwas tun und wo liegen die Daten eines Executables und eines Prozesses?");
					scanner.nextLine();
					System.out.println("A: Executable: Das ist ein Dokument (Binärdatei), das alle Daten beinhaltet, die notwendig sind, um das Programm auszuführen.");
					scanner.nextLine();
					System.out.println("Prozess: Das ist eine Executable, die gerade von einem Betriebssystem ausgeführt wird bzw. alle Datenstrukturen des Betriebssystems," + System.lineSeparator()
					+ "die gebraucht werden, wenn ein Programm ausgeführt wird.");					
					scanner.nextLine();
					System.out.println("Die Daten eines Executables liegen auf der Festplatte und sind nicht aktiv." + System.lineSeparator()
					+ "Diese Datenstrukturen werden im Arbeitsspeicher gehalten und sind aktiv.");
					this.test();

				} else if (random > 0.45 && random <= 0.50) {
					System.out.println("3pt oom-killer: Du hast einen Server (wie in Linux-Grundlagen) in einem Rechenzentrum in Frankfurt, um eine Website zu betreiben." + System.lineSeparator()
					+ "Auf dieser Maschine laufen 2 Programme: Ein SSH-Server und ein Webserver. Über den SSH-Server kannst du dich über das Internet" + System.lineSeparator()
					+ "auf den Server verbinden und ihn warten. Der Webserver stellt deine Website für Browser zur Verfügung." + System.lineSeparator()
					+ "Der Webserver braucht mehr Arbeitsspeicher, um weitere Anfragen von Browsern verarbeiten zu können, allerdings ist der Arbeitsspeicher der Maschine voll." + System.lineSeparator()
					+ "Um Speicher frei zu räumen, muss das Betriebssystem nun irgendein Programm abschießen (Über den Out-of-Memory Killer, kurz OOM-Killer)." + System.lineSeparator()
					+ "Begründe kurz, welches der beiden Programme abgeschossen werden sollte und wie man das erreicht.");
					scanner.nextLine();
					System.out.println("A: Der SSH-Server sollte nicht abgeschossen werden, sonst kann man den Server keine Befehle mehr über das Internet geben.");
					scanner.nextLine();
					System.out.println("Man müsste sonst nach Frankfurt fahren, um weitere Befehle direkt einzugeben. → Daher soll der Webserver abgeschossen werden.");
					scanner.nextLine();
					System.out.println("Man muss beim OOM-Killer einstellen, dass der SSH-Server einem wichtiger ist, dann wird bei zu wenig Speicher der Webserver abgeschossen.");
					this.test();

				} else if (random > 0.50 && random <= 0.55) {
					System.out.println("3pt std-vs-uni-io: Du hast zwei Programme, eines das 'printf()' benutzt, eines das 'write()' benutzt.\nNenne das Programm, das sowohl unter Windows als auch unter Linux compiliert und ausgeführt werden kann.\nBegründe deine Entscheidung und warum das andere Programm nicht funktioniert.");
					scanner.nextLine();
					System.out.println("A: Das 'printf()' Programm.");
					scanner.nextLine();
					System.out.println("'printf()' ist teil der Standart-Library von C. Jeder C-Compiler muss ein funktionierendes 'printf()' mitbringen." + System.lineSeparator()
					+ "'write()' ist eine Betriebssystem-Funktion von Linux und läuft nicht unter Windows.");
					this.test();

				} else if (random > 0.55 && random <= 0.60) {
					System.out.println("1pt fd: Das Betriebssystem verwaltet von einem Prozess geöffnete Ressourcen über eine Tabelle\n(z.B. geöffnete Dateien oder Netzwerkverbindungen).\nWie nennt man einen Index in dieser Tabelle (z.B. der Wert, der von 'open()' oder 'socket()' zurück gegeben wird)?");
					scanner.nextLine();
					System.out.println("A: File Descriptor");
					this.test();

				} else if (random > 0.60 && random <= 0.65) {
					System.out.println("1pt hack-self: Nenne das Ziel der IP-Adresse 127.0.0.1.");
					scanner.nextLine();
					System.out.println("A: Der eigene Rechner");
					this.test();

				} else if (random > 0.65 && random <= 0.70) {
					System.out.println("3pt ip-scopes: Nenne 3 verschiedene Scopes von IP-Adressen und jeweils von wo aus solche IP-Adressen erreichbar sind.");
					scanner.nextLine();
					System.out.println("A: loopback: nur vom eigenen Rechner erreichbar");
					System.out.println("link-local: nur vom Rechnern am gleichen Router erreichbar");
					System.out.println("global: vom ganzen Internet aus erreichbar");
					System.out.println("organization/site-local/unique-local: nur innerhalb der eigenen Firma erreichbar");
					this.test();

				} else if (random > 0.70 && random <= 0.75) {
					System.out.println("1pt poll-name: Nenne den Namen der Funktion vom Betriebssystem, mit der du auf mehrere Events gleichzeitig warten kannst.");
					scanner.nextLine();
					System.out.println("A: poll()");
					this.test();

				} else if (random > 0.75 && random <= 0.80) {
					System.out.println("3pt poll: Erläutere die Situation, für die das Betriebssystem die 'poll()'-Funktion zur Verfügung stellt.\nWie viele Ressourcen sind beteiligt und unter welchen zeitlichen Einschränkungen?");
					scanner.nextLine();
					System.out.println("A: Man muss auf *mehrere* Events *gleichzeitig* warten.");
					this.test();

				} else if (random > 0.80 && random <= 0.85) {
					System.out.println("3pt event-loop: Erläutere stichpunktweise den Ablauf einer Eventloop.");
					scanner.nextLine();
					System.out.println("A: - warten bis mögliche Events passieren (z.B. mit poll())");
					System.out.println("- angefallene Events verarbeiten bzw. auf sie reagieren");
					System.out.println("- wieder vorn vorne anfangen");
					this.test();

				} else if (random > 0.85 && random <= 0.90) {
					System.out.println("3pt gui-tree: Du hast ein GUI-Programm mit folgender Oberfläche:"
							+ "\n" + System.lineSeparator()
							+ "    +-------------+-------------+-------------+" + System.lineSeparator()
							+ "    |    Laden    |  Speichern  | Exportieren |" + System.lineSeparator()
							+ "    +-------------+-------------+-------------+" + System.lineSeparator()
							+ "    |                                         |" + System.lineSeparator()
							+ "    |                   Text                  |" + System.lineSeparator()
							+ "    |                                         |" + System.lineSeparator()
							+ "    +--------------------------------+--------+" + System.lineSeparator()
							+ "    | Suchtext                       | Suchen |" + System.lineSeparator()
							+ "    +--------------------------------+--------+" + System.lineSeparator()
							+ "\n"
							+ "Nenne den Element-Baum den diese GUI-Elemente bilden (Buttons, Textbox sowie Dialog, VBox und HBox).");
					scanner.nextLine();
					System.out.println("A: \n	Dialog" + System.lineSeparator()
					+ "	  VBox" + System.lineSeparator()
					+ "	    HBox" + System.lineSeparator()
					+ "	      Laden Button " + System.lineSeparator()
					+ "	      Speichern Button" + System.lineSeparator()
					+ "	      Exportieren Button" + System.lineSeparator()
					+ "	    Text" + System.lineSeparator()
					+ "	    HBox" + System.lineSeparator()
					+ "		Suchtext" + System.lineSeparator()
					+ "		Suchen Button");
					this.test();

				} else if (random > 0.90 && random <= 0.95) {
					System.out.println("1pt os-gui-interface: Nenne die Zuständigkeiten des Betriebssystems für GUIs");
					scanner.nextLine();
					System.out.println("A: - Input-Geräte an die GUI liefern (z.B. Maus, Tastatur, Touch..)");
					System.out.println("- Rechteck auf dem Bildschirm bereitstellen, in dem die GUI das User Interface zeichnen kann");
					this.test();

				} else if (random >= 0.05 && random <= 0.10) {

					System.out.println("1pt gui-control: Nenne wer in einem GUI-Programm die Kontrolle über den Ablauf des Programms hat (wann es wartet, weiter läuft oder wann etwas passiert).\nDie GUI-Library oder der Programmierer selbst?");
					scanner.nextLine();
					System.out.println("A: Die GUI-Library");
					this.test();

				} else {
					System.out.println("3pt callbacks: Du hast ein GUI-Programm mit einem Button. Der Button wird vom Benutzer gedrückt.\nNenne die nötigen Schritte, um in deinem Programm auf dieses Ereignis zu reagieren.");
					scanner.nextLine();					
					System.out.println("A: - Callback-Funktion muss definiert werden. Sie enthält den Code, der ausgeführt werden soll, wenn der Button gedrückt wird.");
					System.out.println("- muss der GUI-Library bzw. der Event-Loop sagen, dass sie den Callback ausführen soll, wenn das gewünschte Ereignis passiert.");
					this.test();
				}
			} else if (option.matches("stop")) {

				System.out.println("Programm beendet.");
				System.exit(0);
				
			} else {
				System.out.println("Fehler.");
				this.test();
			}
		} while (option == null);
	}
}