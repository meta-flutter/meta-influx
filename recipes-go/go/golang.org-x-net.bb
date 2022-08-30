DESCRIPTION = "Go supplementary libraries"
SECTION = "net"
HOMEPAGE = "https://godoc.org/golang.org/x"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "\
    git://github.com/golang/net.git;branch=master;protocol=https;name=net;destsuffix=${BPN}-${PV}/src/golang.org/x/net \
    git://github.com/golang/crypto.git;branch=master;protocol=https;name=crypto;destsuffix=${BPN}-${PV}/src/golang.org/x/crypto \
    git://github.com/golang/text.git;branch=master;protocol=https;name=text;destsuffix=${BPN}-${PV}/src/golang.org/x/text \   
    "

UPSTREAM_CHECK_COMMITS = "1"

SRCREV_net = "5602c733f70afc6dcec6766be0d5034d4c4f14de"
SRCREV_crypto = "cbc3d0884eac986df6e78a039b8792e869bff863"
SRCREV_text = "f4b4367115ec2de254587813edaa901bc1c723a8"

GO_IMPORT = "golang.org/x"
GO_INSTALL = "\
    ${GO_IMPORT}/net/... \
    ${GO_IMPORT}/crypto/... \
    ${GO_IMPORT}/text/cases/... \
    ${GO_IMPORT}/text/collate/... \
    ${GO_IMPORT}/text/currency/... \
    ${GO_IMPORT}/text/encoding/... \
    ${GO_IMPORT}/text/internal/... \
    ${GO_IMPORT}/text/language/... \
    ${GO_IMPORT}/text/message/... \
    ${GO_IMPORT}/text/runes/... \
    ${GO_IMPORT}/text/search/... \
    ${GO_IMPORT}/text/secure/... \
    ${GO_IMPORT}/text/transform/... \
    ${GO_IMPORT}/text/unicode/... \
    ${GO_IMPORT}/text/width/... \
"

PROVIDES += "\
    golang.org-x-crypto \
    golang.org-x-text \
    "

inherit go
