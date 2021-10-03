def format_bad_url(link):
    parts = link.split("/")
    res = ""
    for part in parts:
        if part:
            res += part + "/"

    return res[:-1]  # remove the last added slash


if __name__ == "__main__":
    link = input()
    print(format_bad_url(link))
