/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmc;

import com.google.common.base.Optional;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Lists;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author bjssgong
 */
public class mmcJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public mmcJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DIY文件处理");
        setResizable(false);

        jLabel2.setText("   源路径");

        jLabel3.setText("目标路径");

        jButton1.setText("确定");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTextField1, org.jdesktop.beansbinding.ELProperty.create("false"), jTextField1, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTextField2, org.jdesktop.beansbinding.ELProperty.create("flase"), jTextField2, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        jButton2.setText("选择");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("选择");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTextArea1, org.jdesktop.beansbinding.ELProperty.create("false"), jTextArea1, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTextArea1);

        jButton4.setText("清除");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("预览");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("取消");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(287, 287, 287)
                                    .addComponent(jButton3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(53, 53, 53)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        boolean result = this.checkoutInput();
        if (!result) {
            return;
        }
        List<File> listFiles = null;
        listFiles = this.assembleSrcFile();
        if (null == listFiles || listFiles.isEmpty()) {
            return;
        }
        this.addMaxFileNumCache();
        String new_base_filename = "", new_filename = "";
        for (File f : listFiles) {
            int start = fileMaxNum.incrementAndGet();
            try {
                DecimalFormat df = new DecimalFormat("0000");
                new_base_filename = PREFIX + df.format(start);
            } catch (NumberFormatException e) {

            }
            String ext = FilenameUtils.getExtension(f.getName());
            if (StringUtils.isBlank(ext)) {
                ext = DEF_EXT;
            }
            new_filename = new_base_filename + "." + ext;
            renameFile(f.getAbsolutePath(), new_filename);

            try {
                copyFile(jTextField1.getText() + "/" + new_filename, jTextField2.getText());
            } catch (IOException ex) {
                Logger.getLogger(mmcJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        fileMaxNum.set(0);
        JOptionPane.showMessageDialog(this, "操作成功", "提示", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_jButton1ActionPerformed
    private static class FileName {

        private int name1;
        private String name2;

        public FileName() {

        }

        public FileName(int name1, String name2) {
            this.name1 = name1;
            this.name2 = name2;
        }

        public int getName1() {
            return name1;
        }

        public String getName2() {
            return name2;
        }

        public void setName1(int name1) {
            this.name1 = name1;
        }

        public void setName2(String name2) {
            this.name2 = name2;
        }

    }

    private void sortFileByName(List<FileName> list) {
        Collections.sort(list, (FileName o1, FileName o2) -> {
            return o1.getName1() - o2.getName1();
        });
    }

    private List<FileName> getSrcFileList(File file) {
        File[] files = file.listFiles();
        if (ArrayUtils.isEmpty(files)) {
            JOptionPane.showMessageDialog(this, "源文件夹无数据", "提示", JOptionPane.ERROR_MESSAGE);
            return Collections.emptyList();
        }
        List<FileName> list = Lists.newArrayList();
        Pattern pattern = Pattern.compile("[^0-9]");
        for (File f : files) {
            String[] str = f.getName().split("\\.");
            if (ArrayUtils.isNotEmpty(str)
                    && str.length >= 1
                    && StringUtils.isNotEmpty(str[0])) {
                Matcher a1 = pattern.matcher(str[0]);
                String tmp = a1.replaceAll("").trim();
                FileName filename = new FileName(StringUtils.isEmpty(tmp) ? 0 : Integer.parseInt(tmp),
                        str[0]);
                list.add(filename);

            }
        }
        return list;
    }

    private List<File> assembleSrcFile() {
        //src
        File file = new File(jTextField1.getText());
        List<FileName> list = getSrcFileList(file);
        this.sortFileByName(list);
        List<File> listFiles = Lists.newArrayList();
        for(FileName tmp : list) {
             listFiles.add(new File(jTextField1.getText() + "/" + tmp.getName2() + "." + DEF_EXT));
        }
        return listFiles;
    }

    private void addMaxFileNumCache() {
        //target
        File target_file = new File(jTextField2.getText());
        List<FileName> target_list = getSrcFileList(target_file);
        // sort
        this.sortFileByName(target_list);
        // get name
        if (null == target_list || target_list.isEmpty()) {
            return;
        }

        FileName filename = target_list.get(target_list.size() - 1);
        if (null == filename) {
            return;
        }
        String filenamestr = filename.getName2().trim();
        filenamestr = FilenameUtils.getBaseName(filenamestr);
        filenamestr = filenamestr.substring(filenamestr.length() - 4, filenamestr.length());
        final int mx = Integer.parseInt(filenamestr);

        // cache
        int result = 0;
        Optional<Integer> tmp = Optional.fromNullable(null);
        try {
            tmp = cacheFileName.get(FILE_MAX_NUM_KEY, () -> {
                return Optional.fromNullable(mx);
            });
        } catch (ExecutionException ex) {
            Logger.getLogger(mmcJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (tmp.isPresent()) {
            result = tmp.get();
        }
        fileMaxNum.set(result);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cacheFileName.invalidate(FILE_MAX_NUM_KEY);
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setDialogTitle("选择源文件夹");
        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            String filepath = file.getAbsolutePath();
            jTextField1.setText(filepath);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    private static void copyFile(String resFilePath, String distFolder) throws IOException {
        File resFile = new File(resFilePath);
        File distFile = new File(distFolder);
        if (resFile.isDirectory()) {
            FileUtils.copyDirectoryToDirectory(resFile, distFile);
        } else if (resFile.isFile()) {
            FileUtils.copyFileToDirectory(resFile, distFile, true);
        }
    }

    private static boolean renameFile(String resFilePath, String newFileName) {
        String newFilePath = formatPath(getParentPath(resFilePath) + "/" + newFileName);
        File resFile = new File(resFilePath);
        File newFile = new File(newFilePath);
        return resFile.renameTo(newFile);
    }

    private static String getParentPath(String path) {
        return new File(path).getParent();
    }

    private static String formatPath(String path) {
        String reg0 = "\\\\＋";
        String reg = "\\\\＋|/＋";
        String temp = path.trim().replaceAll(reg0, "/");
        temp = temp.replaceAll(reg, "/");
        if (temp.endsWith("/")) {
            temp = temp.substring(0, temp.length() - 1);
        }
        if (System.getProperty("file.separator").equals("\\")) {
            temp = temp.replace('/', '\\');
        }
        return temp;
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cacheFileName.invalidate(FILE_MAX_NUM_KEY);
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setDialogTitle("选择目标文件夹");
        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            String filepath = file.getAbsolutePath();
            jTextField2.setText(filepath);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextArea1.setText("");
        cacheFileName.invalidate(FILE_MAX_NUM_KEY);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        boolean result = this.checkoutInput();
        if (!result) {
            return;
        }
        //src
        List<File> listFiles = null;
        listFiles = this.assembleSrcFile();
        if (null == listFiles || listFiles.isEmpty()) {
            return;
        }

        this.addMaxFileNumCache();
        String new_base_filename = "", new_filename = "";
        List<String> viewList = Lists.newArrayList();
        for (File f : listFiles) {
            int start = fileMaxNum.incrementAndGet();
            try {
                DecimalFormat df = new DecimalFormat("0000");
                new_base_filename = PREFIX + df.format(start);
            } catch (NumberFormatException e) {

            }
            String ext = FilenameUtils.getExtension(f.getName());
            if (StringUtils.isBlank(ext)) {
                ext = DEF_EXT;
            }
            new_filename = new_base_filename + "." + ext;
            viewList.add(new_filename);
        }
        jTextArea1.setText(StringUtils.join(viewList.toArray(new String[0]), "\n"));
        fileMaxNum.set(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButton6ActionPerformed

    private boolean checkoutInput() {
        if (StringUtils.isBlank(this.jTextField1.getText())) {
            JOptionPane.showMessageDialog(this, "请输入源文件夹路径", "提示", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (StringUtils.isBlank(this.jTextField2.getText())) {
            JOptionPane.showMessageDialog(this, "请输入毛毛虫点读笔文件夹路径", "提示", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mmcJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mmcJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mmcJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mmcJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mmcJFrame().setVisible(true);
            }
        });
    }

    private final int totalFile = 1000;
    private final int expireTime = 24;
    private final TimeUnit expireTimeUnit = TimeUnit.HOURS;
    private Cache<String, Optional<Integer>> cacheFileName = CacheBuilder.newBuilder().initialCapacity(totalFile)
            .maximumSize(totalFile)
            .concurrencyLevel(100)
            .expireAfterWrite(expireTime, expireTimeUnit)
            .build();
    private static final String FILE_MAX_NUM_KEY = "fileNum";
    private static final String DEF_EXT = "mp3";
    private static final String PREFIX = "REC";
    private AtomicInteger fileMaxNum = new AtomicInteger(0);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
