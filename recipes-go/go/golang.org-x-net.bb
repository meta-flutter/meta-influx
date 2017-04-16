DESCRIPTION = "Go supplementary libraries"
SECTION = "net"
HOMEPAGE = "https://godoc.org/golang.org/x"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

GO_IMPORT = "golang.org/x"

PROVIDES += "golang.org-x-crypto"
PROVIDES += "golang.org-x-text"
PROVIDES += "golang.org-x-tools"


inherit go

SRC_URI = "\
    git://github.com/golang/net.git;protocol=https;name=net;destsuffix=${PN}-${PV}/src/golang.org/x/net \
    git://github.com/golang/crypto.git;protocol=https;name=crypto;destsuffix=${PN}-${PV}/src/golang.org/x/crypto \
    git://github.com/golang/text.git;protocol=https;name=text;destsuffix=${PN}-${PV}/src/golang.org/x/text \   
    git://github.com/golang/tools.git;protocol=https;name=tools;destsuffix=${PN}-${PV}/src/golang.org/x/tools \
    "


SRCREV_net = "5602c733f70afc6dcec6766be0d5034d4c4f14de"
SRCREV_crypto = "cbc3d0884eac986df6e78a039b8792e869bff863"
SRCREV_text = "f4b4367115ec2de254587813edaa901bc1c723a8"
SRCREV_tools = "663269851cdddc898f963782f74ea574bcd5c814"
