1)  grep --include=\om.log -rnw '/path/to/somewhere' -e "pattern"
         -r---->recursive 
         -n---->line number
         -w---->whole word
2)  awk '/MemTotal/{total=$2}/FreeTotal/{free=$2}END{print (total-free)/1024' /proc/memifo
3)  euqals: free -m
4) while true
         do
         #
         #
         done
5)case $option in
  1)
  #
  ;;
  2)
  #
  ;;
  esac
6)ftp 192.168.1.1
  sftp root@192.168.1.1 22
