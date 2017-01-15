import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by USER on 2017-01-15.
 */
public class BOJ14216 {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int dArray[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            String str = in.readLine();
            String strs[] = str.split("\\s+");
            for (int j = 0; j < n; j++) {
                dArray[i][j] = Integer.parseInt(strs[j]);
            }
        }
        int rowSum[] = new int[n];
        int rowOpcost[] = new int[n];
        int opCost[][] = new int[n][n];
        double relativeCost[][] = new double[n][n];
        int jobDone[] = new int[n];     // col
        int jobDone2[] = new int[n];    // row

        for (int i = 0; i < n; i++) {
            jobDone[i] = 0;
            jobDone2[i] = 0;
            rowSum[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += dArray[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                opCost[i][j] = rowSum[i] - dArray[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowOpcost[i] += opCost[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                relativeCost[i][j] = (double)(opCost[i][j]) / (double)(rowOpcost[i] - opCost[i][j]);
            }
        }

        int totalCost = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j< n; j++) {
                System.out.print(opCost[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("=====================");


        while (true) {
            int col = -1;
            for (int i = 0; i < n; i++) {
                if (jobDone[i] == 0) {
                    col = i;
                    break;
                }
            }
            if (col == -1) break;

            double max = relativeCost[0][col];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (jobDone[j] != 0) {
                        continue;
                    }
                    if (max < relativeCost[i][j]) {
                        max = relativeCost[i][j];
                        col = j;
                    }
                }
            }

            int row = -1;
            for (int i = 0; i < n; i++) {
                if (jobDone2[i] == 0) {
                    row = i;
                    break;
                }
            }
            if (row == -1) break;

            double max2 = relativeCost[row][col];
            for (int i = 0; i < n; i++) {
                if (jobDone2[i] != 0) {
                    continue;
                }
                if (max2 < relativeCost[i][col]) {
                    max2 = relativeCost[i][col];
                    row = i;
                } else if (max2 == relativeCost[i][col]) {
                    ArrayList<Double> al1 = new ArrayList<Double>();
                    ArrayList<Double> al2 = new ArrayList<Double>();
                    for (int j = 0; j < n; j++) {
                        if (jobDone[j] != 0) {
                            continue;
                        }
                        al1.add(relativeCost[row][j]);
                        al2.add(relativeCost[i][j]);
                    }
                    Collections.sort(al1);
                    Collections.sort(al2);
                    Collections.reverse(al1);
                    Collections.reverse(al2);
                    int big = row;
                    int tmp = 0;
                    for (int j = 0; j < al1.size(); j++) {
                        if (al1.get(j) == al2.get(j)) {
                            continue;
                        }
                        if (al1.get(j) > al2.get(j)) {
                            big = i;
                            tmp = 1;
                            break;
                        } else if (al1.get(j) < al2.get(j)){
                            big = row;
                            tmp = 1;
                            break;
                        }
                    }
                    if (tmp == 0) {
                        ArrayList<Integer> al3 = new ArrayList<Integer>();
                        ArrayList<Integer> al4 = new ArrayList<Integer>();
                        for (int j = 0; j < n; j++) {
                            if (jobDone[j] != 0) {
                                continue;
                            }
                            al3.add(opCost[row][j]);
                            al4.add(opCost[i][j]);
                        }
                        Collections.sort(al3);
                        Collections.sort(al4);
                        Collections.reverse(al3);
                        Collections.reverse(al4);
                        for (int j = 0; j < al3.size(); j++) {
                            if (al3.get(j) == al4.get(j)) {
                                continue;
                            }
                            if (al3.get(j) > al4.get(j)) {
                                big = row;
                                break;
                            } else {
                                big = i;
                                break;
                            }
                        }
                    }
                    row = big;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j< n; j++) {
                    System.out.print(relativeCost[i][j]+ " ");
                }
                System.out.println();
            }
            System.out.println("rowcol " + row+" : "+col);
            totalCost = totalCost + dArray[row][col];

            for (int i = 0; i < n; i++) {
                opCost[i][col] = 0;
                opCost[row][i] = 0;
                rowOpcost[i] = 0;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    rowOpcost[i] += opCost[i][j];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    relativeCost[i][j] = (double)(opCost[i][j]) / (double)(rowOpcost[i] - opCost[i][j]);
                }
            }

            jobDone[col] = 1;
            jobDone2[row] = 1;
        }
        System.out.println(totalCost);
    }
}
