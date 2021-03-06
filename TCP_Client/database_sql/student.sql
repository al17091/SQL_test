USE [student]
GO
/****** Object:  Table [dbo].[Table_done]    Script Date: 2019/06/06 23:37:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Table_done](
	[使用履歴ID] [int] NOT NULL,
	[使用履歴] [nchar](10) NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Table_student_dane]    Script Date: 2019/06/06 23:37:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Table_student_dane](
	[学籍番号] [nchar](10) NULL,
	[使用履歴ID] [nchar](10) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Table_student_data]    Script Date: 2019/06/06 23:37:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Table_student_data](
	[学籍番号] [varchar](50) NOT NULL,
	[座席番号] [varchar](50) NULL,
	[残高情報] [int] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Table_student_name]    Script Date: 2019/06/06 23:37:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Table_student_name](
	[学籍番号] [varchar](50) NOT NULL,
	[学生名前] [varchar](50) NOT NULL,
	[パスワード] [varchar](max) NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
INSERT [dbo].[Table_done] ([使用履歴ID], [使用履歴]) VALUES (0, N'生協        ')
INSERT [dbo].[Table_done] ([使用履歴ID], [使用履歴]) VALUES (1, N'A         ')
INSERT [dbo].[Table_done] ([使用履歴ID], [使用履歴]) VALUES (2, N'B         ')
INSERT [dbo].[Table_done] ([使用履歴ID], [使用履歴]) VALUES (3, N'C         ')
INSERT [dbo].[Table_student_dane] ([学籍番号], [使用履歴ID]) VALUES (N'al17091   ', N'0         ')
INSERT [dbo].[Table_student_dane] ([学籍番号], [使用履歴ID]) VALUES (N'al17091   ', N'1         ')
INSERT [dbo].[Table_student_dane] ([学籍番号], [使用履歴ID]) VALUES (N'al17092   ', N'2         ')
INSERT [dbo].[Table_student_dane] ([学籍番号], [使用履歴ID]) VALUES (N'al17093   ', N'3         ')
INSERT [dbo].[Table_student_data] ([学籍番号], [座席番号], [残高情報]) VALUES (N'al17020', N'', 4000)
INSERT [dbo].[Table_student_data] ([学籍番号], [座席番号], [残高情報]) VALUES (N'al17067', N'', 1500)
INSERT [dbo].[Table_student_data] ([学籍番号], [座席番号], [残高情報]) VALUES (N'al17084', N'', 7000)
INSERT [dbo].[Table_student_data] ([学籍番号], [座席番号], [残高情報]) VALUES (N'al17091', N'C1', 10000)
INSERT [dbo].[Table_student_data] ([学籍番号], [座席番号], [残高情報]) VALUES (N'al17092', N'C2', 2000)
INSERT [dbo].[Table_student_data] ([学籍番号], [座席番号], [残高情報]) VALUES (N'al17093', N'C3', 20000)
INSERT [dbo].[Table_student_name] ([学籍番号], [学生名前], [パスワード]) VALUES (N'al17020', N'ueda', N'rask')
INSERT [dbo].[Table_student_name] ([学籍番号], [学生名前], [パスワード]) VALUES (N'al17067', N'takahashi', N'macpro')
INSERT [dbo].[Table_student_name] ([学籍番号], [学生名前], [パスワード]) VALUES (N'al17084', N'namiki', N'eeeo')
INSERT [dbo].[Table_student_name] ([学籍番号], [学生名前], [パスワード]) VALUES (N'al17091', N'higashi', N'rark')
INSERT [dbo].[Table_student_name] ([学籍番号], [学生名前], [パスワード]) VALUES (N'al17092', N'hikita', N'zodori')
INSERT [dbo].[Table_student_name] ([学籍番号], [学生名前], [パスワード]) VALUES (N'al17093', N'hidai', N'hessho')
