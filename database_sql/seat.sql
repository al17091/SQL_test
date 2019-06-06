USE [seat-info]
GO
/****** Object:  Table [dbo].[Table_seat]    Script Date: 2019/06/06 23:35:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Table_seat](
	[座席番号] [varchar](50) NOT NULL,
	[学籍番号] [nvarchar](50) NOT NULL,
	[時間指定] [int] NOT NULL,
	[予約可否] [int] NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[Table_seat] ([座席番号], [学籍番号], [時間指定], [予約可否]) VALUES (N'C1', N'al17091', 1, 1)
INSERT [dbo].[Table_seat] ([座席番号], [学籍番号], [時間指定], [予約可否]) VALUES (N'C2', N'al17092', 1, 1)
INSERT [dbo].[Table_seat] ([座席番号], [学籍番号], [時間指定], [予約可否]) VALUES (N'C3', N'al17093', 2, 1)
