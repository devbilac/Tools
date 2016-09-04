package br.com.devbilac;
/*
 *'http://www.guj.com.br/t/swing-copiar-pasta-de-um-local-e-salvar-em-outra/132165/6'
 *Base feita pelo Usuario diego_qmota
 *Adptado para a LibGdx/Devbilac por Luiz Ot�vio
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
public class CopiaArquivos {
    /**
     * Copia arquivos de um local para o outro.
     * @param origem - Arquivo de origem
     * @param destino - Arquivo de destino
     * @param overwrite - Confirma��o para sobrescrever os arquivos
     * @throws IOException
     */
    public static void copy(File origem, File destino, boolean overwrite) throws IOException {
        if (destino.exists() && !overwrite) {
            return;
        }
        FileInputStream source = new FileInputStream(origem);
        FileOutputStream destination = new FileOutputStream(destino);
        FileChannel sourceFileChannel = source.getChannel();
        FileChannel destinationFileChannel = destination.getChannel();
        long size = sourceFileChannel.size();
        sourceFileChannel.transferTo(0, size, destinationFileChannel);
    }
    /**
     * Copia todos os arquivos que tenham uma determinada extens�o de uma pasta de origem para outra de destino.
     * @param origem - Diret�rio onde est�o os arquivos a serem copiados
     * @param destino - Diret�rio onde os arquivos ser�o copiados
     * @param extensao - <i>String</i> Extens�o do arquivo que deve ser copiada. Voc� pode inserir a extens�o no formato: ".doc" ou "doc" (por exemplo)
     * @param overwrite - Confirma��o para sobrescrever os arquivos
     * @throws IOException, UnsupportedOperationException
     */
    public static void copyAll(File origem, File destino, String extensao, boolean overwrite) throws IOException, UnsupportedOperationException {
        if (!destino.exists()) {
            destino.mkdir();
        }
        if (!origem.isDirectory()) {
            throw new UnsupportedOperationException("Origem deve ser um diret�rio");
        }
        if (!destino.isDirectory()) {
            throw new UnsupportedOperationException("Destino deve ser um diret�rio");
        }
        File[] files = origem.listFiles();
        for (int i = 0; i < files.length; ++i) {
            if (files[i].isDirectory()) {
                copyAll(files[i], new File(destino + "\\" + files[i].getName()), overwrite);
            } else {
                if (files[i].getName().endsWith(extensao)) {
                    copy(files[i], new File(destino + "\\" + files[i].getName()), overwrite);
                }
            }
        }
    }
    /**
     * Copia todos os arquivos de dentro de uma pasta para outra.
     * @param origem - Diret�rio onde est�o os arquivos a serem copiados
     * @param destino - Diret�rio onde os arquivos ser�o copiados
     * @param overwrite - Confirma��o para sobrescrever os arquivos
     * @throws IOException, UnsupportedOperationException
     */
    public static void copyAll(File origem, File destino, boolean overwrite) throws IOException, UnsupportedOperationException {
        if (!destino.exists()) {
            destino.mkdir();
        }
        if (!origem.isDirectory()) {
            throw new UnsupportedOperationException("Origem deve ser um diret�rio");
        }
        if (!destino.isDirectory()) {
            throw new UnsupportedOperationException("Destino deve ser um diret�rio");
        }
        File[] files = origem.listFiles();
        for (int i = 0; i < files.length; ++i) {
            if (files[i].isDirectory()) {
                copyAll(files[i], new File(destino + "\\" + files[i].getName()), overwrite);
            } else {
                System.out.println("Copiando arquivo: " + files[i].getName());
                copy(files[i], new File(destino + "\\" + files[i].getName()), overwrite);
            }
        }
    }
   
}