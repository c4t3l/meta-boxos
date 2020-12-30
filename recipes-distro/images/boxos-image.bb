DESCRIPTION = "A console-only image based around systemd."

IMAGE_FEATURES += "splash ssh-server-openssh"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "


#IMAGE_INSTALL += "dmidecode systemd-container python3 python3-fcntl python3-msgpack"
#IMAGE_INSTALL += "python3-pycryptodomex python3-pycrypto python3-pyzmq python3-pystemd salt-common"
#IMAGE_INSTALL += "salt-minion btrfs-tools glusterfs glusterfs-server glusterfs-fuse zeromq zstd"

IMAGE_INSTALL += "dmidecode systemd-container python3 python3-pystemd salt-minion"
IMAGE_INSTALL += "btrfs-tools glusterfs glusterfs-server glusterfs-fuse zstd"

PACKAGE_EXCLUDE = "busybox-udhcpc"

inherit core-image
