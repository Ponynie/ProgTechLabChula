import java.io.*;
import java.util.*;
public class FileMatch {
    public static void main(String[] args) {
        ArrayList<AccountRecord> accRec = new ArrayList<AccountRecord>();
        ArrayList<TransactionRecord> trnRec = new ArrayList<TransactionRecord>();
        try (Scanner readerAcc = new Scanner(new File("master.txt")); Scanner readerTrn = new Scanner(new File("trans.txt"))) {
            while (readerAcc.hasNextLine()) {
                String line = readerAcc.nextLine();
                String[] tokens = line.split(" ");
                accRec.add(new AccountRecord(Integer.parseInt(tokens[0]), tokens[1] + " " +  tokens[2], Double.parseDouble(tokens[3])));
            }
            while (readerTrn.hasNextLine()) {
                String line = readerTrn.nextLine();
                String[] tokens = line.split(" ");
                trnRec.add(new TransactionRecord(Integer.parseInt(tokens[0]), Double.parseDouble(tokens[1])));
            }
            for (AccountRecord i : accRec) {
                for (TransactionRecord j : trnRec) {
                    i.combine(j);
                }
            }
            try (RandomAccessFile ranWriter = new RandomAccessFile(new File("newMaster.txt") , "rw")) {
                for (AccountRecord i : accRec) {
                    ranWriter.writeInt(i.getAcctNo());
                    String name30 = i.getName();
                    int spaceNeeded = 30 - i.getName().length();
                    for (int k = 1 ; k <= spaceNeeded ; k++) {
                        name30 += " ";
                    }
                    ranWriter.writeChars(name30);
                    ranWriter.writeDouble(i.getBalance());
                    ranWriter.writeInt(i.getTransCnt());
                }
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
                System.exit(0);
            }
            catch (IOException e) {
                e.printStackTrace();
                System.exit(0);
            }
            catch (Exception e) {
                e.printStackTrace();
                System.exit(0);
            }
            try (RandomAccessFile ranReader = new RandomAccessFile(new File("newMaster.txt") , "r")) {
                int TotalAcc = (int) ranReader.length() / 76;
                double TotalBa = 0;
                for (int i = 1 ; i <= TotalAcc ; i++) {
                    ranReader.seek((76 * (i - 1)) + 64);
                    TotalBa = TotalBa + ranReader.readDouble();
                }
                int noTrans = 0;
                for (int i = 1 ; i <= TotalAcc ; i++) {
                    ranReader.seek(76 * (i - 1) + 72);
                    if (ranReader.readInt() == 0) noTrans++;
                }
                System.out.println("Total Account Record : " + String.valueOf(TotalAcc));
                System.out.println("Total balance : " + String.valueOf(TotalBa));
                System.out.println("No transaction : " + String.valueOf(noTrans) + " account.");
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
                System.exit(0);
            }
            catch (IOException e) {
                e.printStackTrace();
                System.exit(0);
            }
            catch (Exception e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
