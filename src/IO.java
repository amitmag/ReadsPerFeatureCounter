import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.FileWriter;

public class IO {

	// creates the headers of the junctions file
	public void createJunctionsFile(FileWriter writer, String fileName, List<cellsGroup> cells, String[] BAMFiles,
									char flag) {
		try {
			writer.write("Gene Name");
			writer.append(',');
			writer.write("Chromosome");
			writer.append(',');
			if (flag == 's' || flag == 'l') {
				writer.write("Index");
				writer.append(',');
			}
			writer.write("Starting Point");
			writer.append(',');
			writer.write("Ending Point");
			if (flag == 's' || flag == 'l') {
				for (int i = 0; i < cells.size(); i++)
					for (int j = cells.get(i).getFirst(); j <= cells.get(i).getLast(); j++) {
						writer.append(',');
						writer.write("cell" + j);
					}
			} else {
				for (int i = 0; i < BAMFiles.length; i++) {
					writer.append(',');
					writer.write(BAMFiles[i]);
				}

			}
			if (flag == 's' || flag == 'l') {
				writer.append(',');
				writer.write("Total");
			}
			writer.append('\n');
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// creates the headers of the exons file
	public void createExonsFile(FileWriter writer, String fileName, List<cellsGroup> cells, String[] BAMFiles,
								char flag) {
		try {
			writer.write("Gene Name");
			writer.append(',');
			writer.write("Chromosome");
			writer.append(',');
			writer.write("Exon Start");
			writer.append(',');
			writer.write("Exon End");
			if (flag == 's' || flag == 'l') {
				for (int i = 0; i < cells.size(); i++)
					for (int j = cells.get(i).getFirst(); j <= cells.get(i).getLast(); j++) {
						writer.append(',');
						writer.write("cell" + j);
					}
			} else {
				for (int i = 0; i < BAMFiles.length; i++) {
					writer.append(',');
					writer.write(BAMFiles[i]);
				}

			}
			if (flag == 's' || flag == 'l') {
				writer.append(',');
				writer.write("Total");
			}
			writer.append('\n');
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// creates the headers of the introns file
	public void createIntronsFile(FileWriter writer, String fileName, List<cellsGroup> cells, String[] BAMFiles,
								  char flag) {
		try {
			writer.write("Gene Name");
			writer.append(',');
			writer.write("Chromosome");
			writer.append(',');
			writer.write("Intron Start");
			writer.append(',');
			writer.write("Intron End");
			if (flag == 's' || flag == 'l') {
				for (int i = 0; i < cells.size(); i++)
					for (int j = cells.get(i).getFirst(); j <= cells.get(i).getLast(); j++) {
						writer.append(',');
						writer.write("cell" + j);
					}
			} else {
				for (int i = 0; i < BAMFiles.length; i++) {
					writer.append(',');
					writer.write(BAMFiles[i]);
				}

			}
			if (flag == 's' || flag == 'l') {
				writer.append(',');
				writer.write("Total");
			}
			writer.append('\n');
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// creates the headers of the unknownJunctions file
	public void createUnknownJunctionFile(FileWriter writer, String fileName, List<cellsGroup> cells, String[] BAMFiles,
										  char flag) {
		try {
			writer.write("Gene Name");
			writer.append(',');
			writer.write("Chromosome");
			writer.append(',');
			writer.write("Start");
			writer.append(',');
			writer.write("End");
			if (flag == 's' || flag == 'l') {
				for (int i = 0; i < cells.size(); i++)
					for (int j = cells.get(i).getFirst(); j <= cells.get(i).getLast(); j++) {
						writer.append(',');
						writer.write("cell" + j);
					}
			} else {
				for (int i = 0; i < BAMFiles.length; i++) {
					writer.append(',');
					writer.write(BAMFiles[i]);
				}
			}
			if (flag == 's' || flag == 'l') {
				writer.append(',');
				writer.write("Total");
			}
			writer.append('\n');
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// creates the headers of the geneCalls file
	public void createGeneCallsFile(FileWriter writer, String fileName, List<cellsGroup> cells, String[] BAMFiles,
									char flag) {
		try {
			writer.write("Gene Name");
			writer.append(',');
			writer.write("Chromosome");
			writer.append(',');
			writer.write("Start");
			writer.append(',');
			writer.write("End");
			if (flag == 's' || flag == 'l') {
				for (int i = 0; i < cells.size(); i++)
					for (int j = cells.get(i).getFirst(); j <= cells.get(i).getLast(); j++) {
						writer.append(',');
						writer.write("cell" + j);
					}
			} else {
				for (int i = 0; i < BAMFiles.length; i++) {
					writer.append(',');
					writer.write(BAMFiles[i]);
				}
			}
			if (flag == 's' || flag == 'l') {
				writer.append(',');
				writer.write("Total");
			}
			writer.append('\n');
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// creates the interval list file
	public void createIntervalList(Gene gene, int startingPosition, int endingPosition, String fileName,
								   String outputFolder) {
		try {

			FileWriter intervalList = new FileWriter(outputFolder + "/one_gene_" + fileName + ".interval_list");

			intervalList.write("@HD	VN:1.0	SO:coordinate\n");
			intervalList.write("@SQ	SN:chr1	LN:195471971\n");
			intervalList.write("@SQ	SN:chr2	LN:182113224\n");
			intervalList.write("@SQ	SN:chr3	LN:160039680\n");
			intervalList.write("@SQ	SN:chr4	LN:156508116\n");
			intervalList.write("@SQ	SN:chr5	LN:151834684\n");
			intervalList.write("@SQ	SN:chr6	LN:149736546\n");
			intervalList.write("@SQ	SN:chr7	LN:145441459\n");
			intervalList.write("@SQ	SN:chr8	LN:129401213\n");
			intervalList.write("@SQ	SN:chr9	LN:124595110\n");
			intervalList.write("@SQ	SN:chr10	LN:130694993\n");
			intervalList.write("@SQ	SN:chr11	LN:122082543\n");
			intervalList.write("@SQ	SN:chr12	LN:120129022\n");
			intervalList.write("@SQ	SN:chr13	LN:120421639\n");
			intervalList.write("@SQ	SN:chr14	LN:124902244\n");
			intervalList.write("@SQ	SN:chr15	LN:104043685\n");
			intervalList.write("@SQ	SN:chr16	LN:98207768\n");
			intervalList.write("@SQ	SN:chr17	LN:94987271\n");
			intervalList.write("@SQ	SN:chr18	LN:90702639\n");
			intervalList.write("@SQ	SN:chr19	LN:61431566\n");
			intervalList.write("@SQ	SN:chrX	LN:171031299\n");
			intervalList.write("@SQ	SN:chrY	LN:91744698\n");
			intervalList.write("@SQ	SN:chrM	LN:16299\n");
			intervalList.write("@PG	ID:hisat	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-1E820E9B	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-14A15720	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-7273E6B4	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-1E3F1EBC	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-5B52756	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-24E2E5CA	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-51BAA12B	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-10360A12	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-5CFEDC18	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-1BB15083	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-1920A2A1	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-331F1857	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-66E201C1	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-388F9BA3	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-6633AE5B	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-744B41B9	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-2F3E2011	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-4FDC11C0	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-79FFC0D2	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-6585BB20	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-7ED03937	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-4B233571	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-7C6C4B4B	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-2D4AB2C1	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-42843FF8	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-31B0CD2D	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-63034F14	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-117C03D0	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-77EF8678	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-26728B51	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-4B3CB25C	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-5CA83352	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-41470FA9	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-2EB5F440	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-5973C8B0	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-1AB2810	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-65294D4D	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-390344A4	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-4FD2A90E	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-39352FA7	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-784174A9	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-E7139D3	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-4B5E8BA7	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-4FBC02BD	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-50C333C8	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-6F69BE4E	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-7A8A0936	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-39A29A4E	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-28A03168	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-D159C63	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-3BE5B5F8	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-7A1FC824	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-7FC56186	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-12A578F2	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-A553247	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-3CB8A465	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-1244D881	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-1F90784C	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-4E366AD7	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-28230246	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-7B166ED	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-9C50F37	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-51CA628B	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-35353DDE	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-43BBE7F7	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-3ACEA20E	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-668A7FF5	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-704BD515	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-60F6CC70	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-7D3AB405	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-E8AF869	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-4C625DBB	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-74230C78	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-7A32888B	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-403A92BC	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-14248AB5	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-213249C8	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-5E6A38C8	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-7D599B9E	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-5F951251	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-15DC8C9B	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-27545F46	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-53858591	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-7B367BB	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-7CE4A53A	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-3E199BAB	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-6AD44E85	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-31E65989	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-6F8CDC23	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-6F4550A4	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-35526512	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-4200C771	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-18EE3AD5	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-288D1DDE	PN:hisat	VN:0.1.6-beta\n");
			intervalList.write("@PG	ID:hisat-2A676751	PN:hisat	VN:0.1.6-beta\n");

			intervalList.write(gene.getChrom());
			intervalList.write("\t");
			intervalList.write(String.format("%d", startingPosition));
			intervalList.write("\t");
			intervalList.write(String.format("%d", endingPosition));
			intervalList.write("\t");
			intervalList.write("-");
			intervalList.write("\t");
			intervalList.write(gene.getName());

			if (!gene.getChrom().toLowerCase().startsWith("chr"))
				System.out.println("The chromosome of the gene" + gene.getName() + "does not start with 'chr'");

			intervalList.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// write in the junctions file the junctions for every gene
	public void writeJunction(FileWriter writer, Gene gene, List<cellsGroup> cells, int numOfCalls, char flag) {
		try {
			for (int i = 0; i < gene.getJunctions().length; i++) {
				Junction junc = (Junction) gene.getJunctions()[i];
				writer.write(gene.getName());
				writer.append(',');
				writer.write(gene.getChrom());
				writer.append(',');
				if (flag == 's' || flag == 'l') {
					if (junc.getStartCounter() != 0 && junc.getEndCounter() != 0) {
						writer.write(String.format("%d", junc.getStartCounter()));
						writer.write(";");
						writer.write(String.format("%d", junc.getEndCounter()));
					} else if (junc.getStartCounter() != 0)
						writer.write(String.format("%d", (junc.getStartCounter())));
					else
						writer.write(String.format("%d", (junc.getEndCounter())));
					writer.append(',');
				}
				writer.write(String.format("%d", junc.getStart()));
				writer.append(',');
				writer.write(String.format("%d", junc.getEnd()));
				writer.append(',');
				if (flag == 's' || flag == 'l') {
					for (int j = 0; j < cells.size(); j++) {
						for (int a = 0; a < cellsGroup.rangeSize(cells, j); a++) {
							if (numOfCalls == -1)
								writer.write(0);
							else if (junc.getCells().get(j)[a] == 0)
								writer.write("   ");
							else
								writer.write(String.format("%d", junc.getCells().get(j)[a]));
							writer.append(',');
						}
					}

					writer.write(String.format("%d", junc.sumCells()));
				} else {
					for (int j = 0; j < junc.getBamFiles().length; j++) {
						if (junc.getBamFiles()[j] == 0)
							writer.write("   ");
						else
							writer.write(junc.getBamFiles()[j] + "");
						writer.append(',');
					}
				}
				writer.append(System.lineSeparator());

			}

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	// write for every gene in which cell and exon the calls fall
	public void writeExon(FileWriter writer, Gene gene, List<cellsGroup> cells, int numOfCalls, char flag) {
		try {
			for (int i = 0; i < gene.getExons().length; i++) {
				Exon exon = (Exon) gene.getExons()[i];
				writer.write(gene.getName());
				writer.append(',');
				writer.write(gene.getChrom());
				writer.append(',');
				writer.write(String.format("%d", exon.getStart()));
				writer.append(',');
				writer.write(String.format("%d", exon.getEnd()));
				writer.append(',');
				if (flag == 's' || flag == 'l') {
					for (int j = 0; j < cells.size(); j++) {
						for (int a = 0; a < cellsGroup.rangeSize(cells, j); a++) {
							if (numOfCalls == -1)
								writer.write(0);
							else if (exon.getCells().get(j)[a] == 0)
								writer.write("   ");
							else
								writer.write(String.format("%d", exon.getCells().get(j)[a]));
							writer.append(',');
						}
					}
					writer.write(String.format("%d", exon.sumCells()));
				} else {
					for (int a = 0; a < exon.getBamFiles().length; a++) {
						if (exon.getBamFiles()[a] == 0)
							writer.write("   ");
						else
							writer.write(exon.getBamFiles()[a] + "");
						writer.append(',');
					}

				}
				writer.append(System.lineSeparator());

			}
			// skippingExon(41310655, 41310762, writer2, gene, cells);
			// writePercentage(41310655, 41310762, writer2, gene, cells);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	// write in the introns file the introns for every gene
	public void writeIntron(FileWriter writer, Gene gene, List<cellsGroup> cells, int numOfCalls, char flag) {
		try {
			for (int i = 0; i < gene.getIntrons().length; i++) {
				Intron intron = (Intron) gene.getIntrons()[i];
				writer.write(gene.getName());
				writer.append(',');
				writer.write(gene.getChrom());
				writer.append(',');
				writer.write(String.format("%d", intron.getStart()));
				writer.append(',');
				writer.write(String.format("%d", intron.getEnd()));
				writer.append(',');
				if (flag == 's' || flag == 'l') {
					for (int j = 0; j < cells.size(); j++) {
						for (int a = 0; a < cellsGroup.rangeSize(cells, j); a++) {
							if (numOfCalls == -1)
								writer.write(0);
							else if (intron.getCells().get(j)[a] == 0)
								writer.write("   ");
							else
								writer.write(String.format("%d", intron.getCells().get(j)[a]));
							writer.append(',');
						}
					}
					writer.write(String.format("%d", intron.sumCells()));
				} else {
					for (int a = 0; a < intron.getBamFiles().length; a++) {
						if (intron.getBamFiles()[a] == 0)
							writer.write("   ");
						else
							writer.write(intron.getBamFiles()[a] + "");
						writer.append(',');
					}
				}
				writer.append(System.lineSeparator());

			}
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	// write for every gene in which cell and exon the calls fall
	public void writeUnknownJunction(FileWriter writer, Gene gene, List<cellsGroup> cells, int geneStart, int geneEnd,
									 int numOfCalls, char flag) {
		try {

			writer.write(gene.getName());
			writer.append(',');
			writer.write(gene.getChrom());
			writer.append(',');
			writer.write(String.format("%d", geneStart));
			writer.append(',');
			writer.write(String.format("%d", geneEnd));
			writer.append(',');
			if (flag == 's' || flag == 'l') {
				for (int i = 0; i < cells.size(); i++) {
					for (int a = 0; a < cellsGroup.rangeSize(cells, i); a++) {
						if (numOfCalls == -1)
							writer.write(0);
						else if (gene.getCells().get(i)[a] == 0)
							writer.write("   ");
						else
							writer.write(String.format("%d", gene.getUnknowncells().get(i)[a]));
						writer.append(',');
					}
				}
				writer.write(String.format("%d", gene.sumUnknownJunctionCalls()));
			} else {
				for (int i = 0; i < gene.getUnknownBF().length; i++) {
					if (gene.getUnknownBF()[i] == 0)
						writer.write("   ");
					else
						writer.write(gene.getUnknownBF()[i] + "");
					writer.append(',');
				}
			}
			writer.append(System.lineSeparator());
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public void writeGeneCell(FileWriter writer, Gene gene, List<cellsGroup> cells, int geneStart, int geneEnd,
							  int totalCalls, int numOfCalls, char flag) {
		try {
			writer.write(gene.getName());
			writer.append(',');
			writer.write(gene.getChrom());
			writer.append(',');
			writer.write(String.format("%d", geneStart));
			writer.append(',');
			writer.write(String.format("%d", geneEnd));
			writer.append(',');
			if (flag == 's' || flag == 'l') {
				for (int i = 0; i < cells.size(); i++) {
					for (int a = 0; a < cellsGroup.rangeSize(cells, i); a++) {
						if (numOfCalls == -1)
							writer.write(0);
						else if (gene.getCells().get(i)[a] == 0)
							writer.write("   ");
						else
							writer.write(String.format("%d", gene.getCells().get(i)[a]));
						writer.append(',');
					}
				}
				writer.write(String.format("%d", totalCalls));
			} else {
				for (int i = 0; i < gene.getTotalCallsBF().length; i++) {
					if (gene.getTotalCallsBF()[i] == 0)
						writer.write("   ");
					else
						writer.write(gene.getTotalCallsBF()[i] + "");
					writer.append(',');

				}
			}
			writer.append(System.lineSeparator());

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public void writedifCigar(FileWriter writer, Gene gene, List<cellsGroup> cells, int geneStart, int geneEnd,
							  int numOfCalls, char flag) {
		try {

			writer.write(gene.getName());
			writer.append(',');
			writer.write(gene.getChrom());
			writer.append(',');
			writer.write(String.format("%d", geneStart));
			writer.append(',');
			writer.write(String.format("%d", geneEnd));
			writer.append(',');
			if (flag == 's' || flag == 'l') {
				for (int i = 0; i < cells.size(); i++) {
					for (int a = 0; a < cellsGroup.rangeSize(cells, i); a++) {
						if (numOfCalls == -1)
							writer.write(0);
						else if (gene.getDifCigarCells().get(i)[a] == 0)
							writer.write("   ");
						else
							writer.write(String.format("%d", gene.getDifCigarCells().get(i)[a]));
						writer.append(',');
					}
				}
				writer.write(String.format("%d", gene.sumDifCigarCalls()));
			} else {
				for (int i = 0; i < gene.getDifCigarBF().length; i++) {
					if (gene.getDifCigarBF()[i] == 0)
						writer.write("   ");
					else
						writer.write(gene.getDifCigarBF()[i] + "");
					writer.append(',');
				}

			}
			writer.append(System.lineSeparator());

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	private void skippingExon(int exonStart, int exonEnd, FileWriter file, Gene gene, List<cellsGroup> cells) {
		try {
			float counter = 0;
			float numOfCells = 0;
			for (int i = 0; i < 4; i++)
				file.append(',');
			for (int i = 0; i < gene.getExons().length; i++) {
				if (gene.getExons()[i].getStart() == exonStart && gene.getExons()[i].getEnd() == exonEnd) {
					for (int j = 0; j < cells.size(); j++) {
						for (int a = 0; a < cellsGroup.rangeSize(cells, j); a++) {
							numOfCells++;
							if (((Exon) gene.getExons()[i]).getCells().get(j)[a] > 5) {
								file.write("X");
								counter++;
							} else
								file.write("   ");
							file.append(',');
						}
					}
					float t2 = (float) counter / numOfCells;
					file.write(String.format("%f", t2 * 100));
					file.append(System.lineSeparator());
				}
			}
		} catch (IOException e) {
			e.getMessage();
		}

	}

	private void writePercentage(int exonStart, int exonEnd, FileWriter file, Gene gene, List<cellsGroup> cells) {
		try {
			for (int i = 0; i < 4; i++)
				file.append(',');
			for (int i = 0; i < gene.getExons().length; i++) {
				if (gene.getExons()[i].getStart() == exonStart && gene.getExons()[i].getEnd() == exonEnd) {
					float totalCalls = (float) ((Exon) gene.getExons()[i]).sumCells();
					for (int j = 0; j < cells.size(); j++) {
						for (int a = 0; a < cellsGroup.rangeSize(cells, j); a++) {
							float temp = (float) ((Exon) gene.getExons()[i]).getCells().get(j)[a];
							float prec = (float) temp / totalCalls;
							file.write(String.format("%f", (prec * 100)));
							file.append(',');
						}
					}
					file.append(System.lineSeparator());
				}
			}
		} catch (IOException e) {
			e.getMessage();
		}

	}

	// close files
	public void closeFiles(FileWriter[] files) throws IOException {
		try {
			for (FileWriter f : files)
				f.close();
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public FileWriter createRunLaterFile(String outputPathFolder, String runLaterFileName) {
		FileWriter bw = null;
		try {

			bw = new FileWriter(outputPathFolder + runLaterFileName, true);
			File directory = new File(outputPathFolder + "/LG");
			File[] fList = directory.listFiles();
			if (fList != null) {
				for (int i = 0; i < fList.length; i++) {
					if (fList[i].isFile()) {
						BufferedReader br = new BufferedReader(new FileReader(fList[i]));
						String line = "";
						while ((line = br.readLine()) != null)
							bw.write(line + '\n');
						br.close();
						fList[i].delete();
					}
				}
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return bw;
	}

	//read transcripts file into hashmap
	public HashMap<String, Gene> readTranscriptsFileIntoHashMap(BufferedReader transcriptFile, List<cellsGroup> cells, int bamfilesNumber) {
		HashMap<String, Gene> genes = new HashMap<String, Gene>();
		String line;
		try {
			while ((line = transcriptFile.readLine()) != null) {
				String[] splitLine = line.split("\t");
				if (!genes.containsKey(splitLine[0]) && splitLine.length > 2) {
					if (!splitLine[1].toLowerCase().startsWith("chr"))
						System.out.println("The chromosome of " + splitLine[0] + " does not start with 'chr'");
					Gene gene = new Gene(splitLine[0], splitLine[1], cells, new LinkedList<String>(), new LinkedList<String>(), bamfilesNumber);
					genes.put(splitLine[0], gene);
				}
				genes.get(splitLine[0]).getExonStarts().add(splitLine[2]);
				genes.get(splitLine[0]).getExonEnds().add(splitLine[3]);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return genes;

	}

	public void writeGenesHashSetIntoFile(String fileName, HashMap<String, Gene> genes) {
		try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
				for(String geneName : genes.keySet()) {
					genes.get(geneName).writeGeneToFile(bw);
					bw.write('\n');
				}
				bw.close();
			}

		catch (IOException e){
			e.printStackTrace();
		}
	}

}
